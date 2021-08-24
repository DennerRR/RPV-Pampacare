package com.rp5.crudservice.controller;

import com.rp5.crudservice.dto.RacaDTO;
import com.rp5.crudservice.interfaces.IRacaService;
import com.rp5.crudservice.model.Raca;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/raca")
@Api(value = "API Rest Racas")
@CrossOrigin(origins = "*")
public class RacaController {
    private IRacaService racaService;

    public RacaController(IRacaService racaService) { this.racaService = racaService; }
    @PostMapping("/save")
    @ApiOperation(value = "salvar um Raca no banco de dados ")
    public void saveRaca(@RequestBody RacaDTO racaDTO){
        Raca raca = new Raca();
        raca.setNome(racaDTO.getNome());
        racaService.saveRaca(raca);

    }
    @PutMapping("/update")
    @ApiOperation(value = "Atualizar um Raca no banco de dados")
    public ResponseEntity<?> updateRaca(@RequestBody Raca raca){
        Raca racaUpdated= racaService.updateRaca(raca);
        return new ResponseEntity<>(racaUpdated, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "pegar um Raca no banco de dados pelo Id")
    public ResponseEntity<?> getRacaById(@PathVariable("id")Long id){
        Raca raca = racaService.getRacaById(id);
        return new ResponseEntity<>(raca, HttpStatus.OK);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Retorna todos os Racas cadastrados")
    public ResponseEntity<?> getAllRaca() {
        List<Raca> racas = racaService.findAllRaca();
        return new ResponseEntity<>(racas, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar uma raca pelo id")
    public void deleteRaca(@PathVariable("id") Long id) {
        racaService.deleteRaca(id);

    }
}
