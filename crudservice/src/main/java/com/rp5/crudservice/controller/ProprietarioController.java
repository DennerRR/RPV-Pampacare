package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.ProprietarioDTO;
import com.rp5.crudservice.interfaces.IProprietarioService;
import com.rp5.crudservice.model.Proprietario;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProprietarioController {
    private IProprietarioService proprietarioService;

    public ProprietarioController(IProprietarioService proprietarioService) {
        this.proprietarioService = proprietarioService;
    }
    @PostMapping("/save")
    @ApiOperation(value = "salvar um proprietario no banco de dados ")
    public void saveProprietario(@RequestBody ProprietarioDTO proprietarioDTO){
        Proprietario proprietario = new Proprietario();
        proprietario.setNome(proprietarioDTO.getNome());

        proprietarioService.saveProprietario(proprietario);

    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um Proprietario no banco de dados")
    public ResponseEntity<?> updateProprietario(@RequestBody Proprietario proprietario){
        Proprietario proprietarioUpdated = proprietarioService.updateProprietario(proprietario);
        return new ResponseEntity<>(proprietarioUpdated, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um proprietario no banco de dados pelo Id")
    public ResponseEntity<?> getProprietarioById(@PathVariable("id")Long id){
        Proprietario proprietario = proprietarioService.getProprietarioById(id);
        return new ResponseEntity<>(proprietario, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os proprietarios cadastrados")
    public ResponseEntity<?> getAllProprietarios() {
        List<Proprietario> proprietarios = proprietarioService.findAllProprietarios();
        return new ResponseEntity<>(proprietarios, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar um proprietario pelo id")
    public void deleteProprietario(@PathVariable("id")Long id){
        proprietarioService.deleteProprietario(id);

    }
}
