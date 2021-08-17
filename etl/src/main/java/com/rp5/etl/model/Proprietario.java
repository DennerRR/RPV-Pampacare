package com.rp5.etl.model;

import javax.persistence.*;

@Entity
@Table(name = "proprietarios")
public class Proprietario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Proprietario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Proprietario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
