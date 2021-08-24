package com.rp5.crudservice.controller;


import com.rp5.crudservice.dto.CaoDTO;
import com.rp5.crudservice.interfaces.ICaoService;
import com.rp5.crudservice.interfaces.ICondicaoService;
import com.rp5.crudservice.interfaces.IProprietarioService;
import com.rp5.crudservice.interfaces.IRacaService;
import com.rp5.crudservice.model.Cao;
import com.rp5.crudservice.model.Condicao;
import com.rp5.crudservice.model.Proprietario;
import com.rp5.crudservice.model.Raca;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cao")
@Api(value = "API Rest Cãos")
@CrossOrigin(origins = "*")
public class CaoController {
    private ICaoService caoService;
    private IProprietarioService proprietarioService;
    private IRacaService racaService;
    private ICondicaoService condicaoService;

    public CaoController(ICaoService caoService, IProprietarioService proprietarioService, IRacaService racaService, ICondicaoService condicaoService) {
        this.caoService = caoService;
        this.proprietarioService = proprietarioService;
        this.racaService = racaService;
        this.condicaoService = condicaoService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar um cão no banco de dados ")
    public void saveCao(@RequestBody CaoDTO caoDTO) {
        Proprietario proprietario = proprietarioService.getProprietarioById(caoDTO.getIdProprietario());
        Condicao condicao = condicaoService.getCondicaoById(caoDTO.getIdCondicao());
        Raca raca = racaService.getRacaById(caoDTO.getIdRaca());
        Cao cao = new Cao();
        cao.setCondicao(condicao);
        cao.setRaca(raca);
        cao.setProprietario(proprietario);
        cao.setNome(caoDTO.getNome());
        cao.setIdade(caoDTO.getIdade());
        cao.setColeira(caoDTO.isColeira());
        cao.setVivo(caoDTO.isVivo());
        cao.setSexo(caoDTO.getSexo());
        cao.setEstadoGeral(caoDTO.getEstadoGeral());
        caoService.saveCao(cao);

    }

    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um cão no banco de dados")
    public ResponseEntity<?> updateCao(@RequestBody Cao cao) {
        Cao caoUpdated = caoService.updateCao(cao);
        return new ResponseEntity<>(caoUpdated, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um cão no banco de dados pelo Id")
    public ResponseEntity<?> getCaoById(@PathVariable("id") Long id) {
        Cao cao = caoService.getCaoById(id);
        return new ResponseEntity<>(cao, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os cães cadastrados")
    public ResponseEntity<?> getAllCaes() {
        List<Cao> caes = caoService.findAllCaes();
        return new ResponseEntity<>(caes, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar um cão pelo id")
    public void deleteCao(@PathVariable("id") Long id) {
        caoService.deleteCao(id);

    }
}
