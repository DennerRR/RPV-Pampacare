package com.rp5.crudservice.controller;


import com.rp5.crudservice.dto.ProcedimentoDTO;
import com.rp5.crudservice.interfaces.IExameService;
import com.rp5.crudservice.interfaces.IProcedimentoService;
import com.rp5.crudservice.model.Exame;
import com.rp5.crudservice.model.Procedimento;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procedimento")
@Api(value = "API Rest Procedimentos")
@CrossOrigin(origins = "*")
public class ProcedimentoController {
    private IProcedimentoService procedimentoService;
    private IExameService exameService;

    public ProcedimentoController(IProcedimentoService procedimentoService, IExameService exameService) {
        this.procedimentoService = procedimentoService;
        this.exameService = exameService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar um Procedimento no banco de dados ")
    public void saveProcedimento(@RequestBody ProcedimentoDTO procedimentoDTO){
        Exame exame = exameService.getExameById(procedimentoDTO.getIdExame());
        Procedimento procedimento = new Procedimento();
        procedimento.setExame(exame);
        procedimento.setNome(procedimentoDTO.getNome());
        procedimento.setObs(procedimentoDTO.getObs());
        procedimento.setData(procedimentoDTO.getData());
        procedimentoService.saveProcedimento(procedimento);

    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um Procedimento no banco de dados")
    public ResponseEntity<?> updateProcedimento(@RequestBody Procedimento procedimento){
        Procedimento procedimentoUpdated= procedimentoService.updateProcedimento(procedimento);
        return new ResponseEntity<>(procedimentoUpdated, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um Procedimento no banco de dados pelo Id")
    public ResponseEntity<?> getProcedimentoById(@PathVariable("id")Long id){
        Procedimento procedimento = procedimentoService.getProcedimentoById(id);
        return new ResponseEntity<>(procedimento, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os Procedimentos cadastrados")
    public ResponseEntity<?> getAllProcedimento() {
        List<Procedimento> procedimentos = procedimentoService.findAllProcedimento();
        return new ResponseEntity<>(procedimentos, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar um Procedimento pelo id")
    public void deleteProcedimento(@PathVariable("id") Long id) {
        procedimentoService.deleteProcedimento(id);

    }
}
