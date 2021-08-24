package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procedimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String data;

    private String obs;

   @ManyToOne
   private Exame exame;

    public Procedimento(long id, String nome, String data, String obs, Exame exame) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.obs = obs;
        this.exame = exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Procedimento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


}
