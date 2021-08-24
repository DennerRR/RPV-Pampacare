package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.ExameDTO;
import com.rp5.crudservice.interfaces.IAmostraService;
import com.rp5.crudservice.interfaces.IExameService;
import com.rp5.crudservice.model.Amostra;
import com.rp5.crudservice.model.Exame;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exame")
@Api(value = "API Rest Exames")
@CrossOrigin(origins = "*")
public class ExameController {
    private IExameService exameService;
    private IAmostraService amostraService;

    public ExameController(IExameService exameService, IAmostraService amostraService) {
        this.exameService = exameService;
        this.amostraService = amostraService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar um exame no banco de dados ")
    public void saveExame(@RequestBody ExameDTO exameDTO){
        Amostra amostra = amostraService.getAmostraById(exameDTO.getIdExame());
        Exame exame = new Exame();
        exame.setAmostra(amostra);
        exame.setData(exameDTO.getData());

        exameService.saveExame(exame);

    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um exame no banco de dados")
    public ResponseEntity<?> updateExame(@RequestBody Exame exame){
        Exame exameUpdated= exameService.updateExame(exame);
        return new ResponseEntity<>(exameUpdated, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um exame no banco de dados pelo Id")
    public ResponseEntity<?> getExameById(@PathVariable("id")Long id){
        Exame exame = exameService.getExameById(id);
        return new ResponseEntity<>(exame, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os exames cadastrados")
    public ResponseEntity<?> getAllExame() {
        List<Exame> exames = exameService.findAllExames();
        return new ResponseEntity<>(exames, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar um exame pelo id")
    public void deleteExame(@PathVariable("id") Long id) {
        exameService.deleteExame(id);

    }
}