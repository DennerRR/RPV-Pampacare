package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.AmostraDTO;
import com.rp5.crudservice.interfaces.IAmostraService;
import com.rp5.crudservice.interfaces.ICaoService;
import com.rp5.crudservice.interfaces.IExameService;
import com.rp5.crudservice.model.Amostra;
import com.rp5.crudservice.model.Cao;
import com.rp5.crudservice.model.Exame;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/amostra")
@Api(value = "API Rest amostras")
@CrossOrigin(origins = "*")
public class AmostraController {
    private IAmostraService amostraService;
    private ICaoService caoService;


    public AmostraController(IAmostraService amostraService, ICaoService caoService) {
        this.amostraService = amostraService;
        this.caoService = caoService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar um Amostra no banco de dados ")
    public void saveAmostra(@RequestBody AmostraDTO amostraDTO){
        Cao cao = caoService.getCaoById(amostraDTO.getIdCao());
        Amostra amostra = new Amostra();
        amostra.setCao(cao);
        amostra.setData(amostraDTO.getData());
        amostraService.saveAmostra(amostra);

    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um Amostra no banco de dados")
    public ResponseEntity<?> updateAmostra(@RequestBody Amostra amostra){
        Amostra amostraUpdated= amostraService.updateAmostra(amostra);
        return new ResponseEntity<>(amostraUpdated, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um Amostra no banco de dados pelo Id")
    public ResponseEntity<?> getAmostraById(@PathVariable("id")Long id){
        Amostra amostra = amostraService.getAmostraById(id);
        return new ResponseEntity<>(amostra, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os Amostras cadastrados")
    public ResponseEntity<?> getAllAmostra() {
        List<Amostra> amostras = amostraService.findAllAmostra();
        return new ResponseEntity<>(amostras, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar um Amostra pelo id")
    public void deleteAmostra(@PathVariable("id") Long id) {
        amostraService.deleteAmostra(id);

    }
}
