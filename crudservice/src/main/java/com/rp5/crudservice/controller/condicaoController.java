package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.CondicaoDTO;
import com.rp5.crudservice.interfaces.ICaoService;
import com.rp5.crudservice.interfaces.ICondicaoService;
import com.rp5.crudservice.model.Cao;
import com.rp5.crudservice.model.Condicao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/condicao")
@Api(value = "API Rest Condicao")
@CrossOrigin(origins = "*")
public class condicaoController {
    private ICondicaoService condicaoService;
    private ICaoService caoService;

    public condicaoController(ICondicaoService condicaoService, ICaoService caoService) {
        this.condicaoService = condicaoService;
        this.caoService = caoService;
    }

    @PostMapping("/save")
    @ApiOperation(value = "salvar uma condicao no banco de dados ")
    public void saveCondicao(@RequestBody CondicaoDTO condicaoDTO){
        Condicao condicao = new Condicao();
        condicao.setNome(condicaoDTO.getNome());
        condicaoService.saveCondicao(condicao);

    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar uma condicao no banco de dados")
    public ResponseEntity<?> updateCondicao(@RequestBody Condicao condicao){
        Condicao condicaoUpdated= condicaoService.updateCondicao(condicao);
        return new ResponseEntity<>(condicaoUpdated, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar uma condicao no banco de dados pelo Id")
    public ResponseEntity<?> getCondicaoById(@PathVariable("id")Long id){
        Condicao condicao = condicaoService.getCondicaoById(id);
        return new ResponseEntity<>(condicao, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos as condicoes cadastradas")
    public ResponseEntity<?> getAllUsers() {
        List<Condicao> condicoes = condicaoService.findAllCondicoes();
        return new ResponseEntity<>(condicoes, HttpStatus.OK);
    }
}
