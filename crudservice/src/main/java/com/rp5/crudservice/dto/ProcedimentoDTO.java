package com.rp5.crudservice.dto;

import com.rp5.crudservice.model.Exame;

import javax.persistence.ManyToMany;
import java.util.List;

public class ProcedimentoDTO {
    private String nome;

    private String data;

    private String obs;

    private Long idExame;

    public ProcedimentoDTO(String nome, String data, String obs, Long idExame) {
        this.nome = nome;
        this.data = data;
        this.obs = obs;
        this.idExame = idExame;
    }

    public ProcedimentoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Long getIdExame() {
        return idExame;
    }

    public void setIdExame(Long idExame) {
        this.idExame = idExame;
    }
}
