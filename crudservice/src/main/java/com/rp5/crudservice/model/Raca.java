package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Raca {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToMany
    private List<Cao> cao;

    public Raca(long id, String nome, List<Cao> cao) {
        this.id = id;
        this.nome = nome;
        this.cao = cao;
    }

    public Raca() {
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

    public List<Cao> getCao() {
        return cao;
    }

    public void setCao(List<Cao> cao) {
        this.cao = cao;
    }
}
