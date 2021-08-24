package com.rp5.crudservice.dto;

import com.rp5.crudservice.model.Cao;

import javax.persistence.OneToMany;
import java.util.List;

public class RacaDTO {
    private String nome;

    private Long idCao;

    public RacaDTO(String nome, Long idCao) {
        this.nome = nome;
        this.idCao = idCao;
    }

    public RacaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdCao() {
        return idCao;
    }

    public void setIdCao(Long idCao) {
        this.idCao = idCao;
    }
}
