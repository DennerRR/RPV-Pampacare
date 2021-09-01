package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private Date data;
     private String nome;

    @ManyToMany
    private List<Procedimento> procedimento;

    @ManyToOne
    private Amostra amostra;

    public Exame(Long id, Date data, String nome, List<Procedimento> procedimento, Amostra amostra) {
        this.id = id;
        this.data = data;
        this.nome = nome;
        this.procedimento = procedimento;
        this.amostra = amostra;
    }

    public Exame() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Procedimento> getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(List<Procedimento> procedimento) {
        this.procedimento = procedimento;
    }

    public Amostra getAmostra() {
        return amostra;
    }

    public void setAmostra(Amostra amostra) {
        this.amostra = amostra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}