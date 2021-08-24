package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.BairroDTO;
import com.rp5.crudservice.interfaces.IBairroService;
import com.rp5.crudservice.model.Bairro;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bairro")
@Api(value = "API Rest Bairros")
@CrossOrigin(origins = "*")
public class BairroController {
    private IBairroService bairroService;

    public BairroController(IBairroService bairroService) {
        this.bairroService = bairroService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar um Bairro no banco de dados ")
    public void saveBairro(@RequestBody BairroDTO bairroDTO) {
        Bairro bairro = new Bairro();
        bairro.setNome(bairroDTO.getNome());
        bairro.setArea(bairroDTO.getArea());
        bairro.setComplemento(bairroDTO.getComplemento());
        bairro.setNumero(bairroDTO.getNumero());
        bairro.setRua(bairroDTO.getRua());
        bairroService.saveBairro(bairro);

    }

    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um Bairro no banco de dados")
    public ResponseEntity<?> updateBairro(@RequestBody Bairro bairro) {
        Bairro bairroUpdated = bairroService.updateBairro(bairro);
        return new ResponseEntity<>(bairroUpdated, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um Bairro no banco de dados pelo Id")
    public ResponseEntity<?> getBairroById(@PathVariable("id") Long id) {
        Bairro bairro = bairroService.getBairroById(id);
        return new ResponseEntity<>(bairro, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os Bairros cadastrados")
    public ResponseEntity<?> getAllBairro() {
        List<Bairro> bairros = bairroService.findAllBairro();
        return new ResponseEntity<>(bairros, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar um Bairro pelo id")
    public void deleteBairro(@PathVariable("id") Long id) {
        bairroService.deleteBairro(id);

    }
}
