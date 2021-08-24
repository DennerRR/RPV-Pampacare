package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "proprietarios")
public class Proprietario {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    private List<Cao> cao;

    @ManyToMany
    private List<Propriedade> propriedade;

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
