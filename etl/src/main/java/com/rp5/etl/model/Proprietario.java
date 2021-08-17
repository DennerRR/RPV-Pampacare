package com.rp5.etl.model;

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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Cao> cao;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Propriedade> propriedade;

    public Proprietario(Long id, String nome, List<Cao> cao, List<Propriedade> propriedade) {
        this.id = id;
        this.nome = nome;
        this.cao = cao;
        this.propriedade = propriedade;
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

    public List<Cao> getCao() {
        return cao;
    }

    public void setCao(List<Cao> cao) {
        this.cao = cao;
    }

    public List<Propriedade> getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(List<Propriedade> propriedade) {
        this.propriedade = propriedade;
    }
}
