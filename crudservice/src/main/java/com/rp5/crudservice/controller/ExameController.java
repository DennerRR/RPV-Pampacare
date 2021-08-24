package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.ExameDTO;
import com.rp5.crudservice.interfaces.IExameService;
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

    public ExameController(IExameService exameService) { this.exameService = exameService; }
    @PostMapping("/save")
    @ApiOperation(value = "salvar um exame no banco de dados ")
    public void saveExame(@RequestBody ExameDTO exameDTO){
        Exame exame = new Exame();
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
    public ResponseEntity<?> getAllUsers() {
        List<Exame> exames = exameService.findAllExames();
        return new ResponseEntity<>(exames, HttpStatus.OK);
    }
}