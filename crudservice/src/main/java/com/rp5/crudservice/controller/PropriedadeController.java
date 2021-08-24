package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.CaoDTO;
import com.rp5.crudservice.dto.PropriedadeDTO;
import com.rp5.crudservice.interfaces.IBairroService;
import com.rp5.crudservice.interfaces.IPropriedadeService;
import com.rp5.crudservice.interfaces.IProprietarioService;
import com.rp5.crudservice.model.Bairro;
import com.rp5.crudservice.model.Cao;
import com.rp5.crudservice.model.Propriedade;
import com.rp5.crudservice.model.Proprietario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propriedade")
@Api(value = "API Rest Propriedades")
@CrossOrigin(origins = "*")
public class PropriedadeController {
    private IPropriedadeService propriedadeService;
    private IBairroService bairroService;
    private IProprietarioService proprietarioService;

    public PropriedadeController(IPropriedadeService propriedadeService, IBairroService bairroService, IProprietarioService proprietarioService) {
        this.propriedadeService = propriedadeService;
        this.bairroService = bairroService;
        this.proprietarioService = proprietarioService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar uma Propriedade no banco de dados ")
    public void savePropriedade(@RequestBody PropriedadeDTO propriedadeDTO) {
        Bairro bairro = bairroService.getBairroById(propriedadeDTO.getIdBairro());
        Proprietario proprietario = proprietarioService.getProprietarioById(propriedadeDTO.getIdProprietario());
        Propriedade propriedade = new Propriedade();
        propriedade.setProprietario(proprietario);
        propriedade.setBairro(bairro);
        propriedade.setLatitude(propriedadeDTO.getLatitude());
        propriedade.setLongitude(propriedadeDTO.getLongitude());
        propriedadeService.savePropriedade(propriedade);
    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar uma propriedade no banco de dados")
    public ResponseEntity<?> updatePropriedade(@RequestBody Propriedade propriedade) {
        Propriedade propriedade1 = propriedadeService.updatePropriedade(propriedade);
        return new ResponseEntity<>(propriedade1, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar uma propriedade no banco de dados pelo Id")
    public ResponseEntity<?> getPropriedadeById(@PathVariable("id") Long id) {
        Propriedade propriedade = propriedadeService.getPropriedadeById(id);
        return new ResponseEntity<>(propriedade, HttpStatus.OK);
    }
    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos as propriedades cadastrados")
    public ResponseEntity<?> getAllPropriedades() {
        List<Propriedade> propriedades = propriedadeService.findAllPropriedades();
        return new ResponseEntity<>(propriedades, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar uma propriedade pelo id")
    public void deletePropriedade(@PathVariable("id") Long id) {
        propriedadeService.deletePropriedade(id);
    }
}
