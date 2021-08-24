package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_Cao")
    private String nome;

    @Column(name = "idade")
    private int idade;

    private boolean coleira;

    private boolean vivo;

    private String sexo;

    private String estadoGeral;

    @OneToMany
    private List<Amostra> amostra;

    @ManyToOne
    private Raca raca;

    @ManyToOne
    Condicao condicao;

    @ManyToOne
    private Proprietario proprietario;

    public Cao() {
    }

    public Cao(Long id, String nome, int idade, boolean coleira, boolean vivo, String sexo, String estadoGeral, List<Amostra> amostra, Raca raca, Condicao condicao, Proprietario proprietario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.coleira = coleira;
        this.vivo = vivo;
        this.sexo = sexo;
        this.estadoGeral = estadoGeral;
        this.amostra = amostra;
        this.raca = raca;
        this.condicao = condicao;
        this.proprietario = proprietario;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isColeira() {
        return coleira;
    }

    public void setColeira(boolean coleira) {
        this.coleira = coleira;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoGeral() {
        return estadoGeral;
    }

    public void setEstadoGeral(String estadoGeral) {
        this.estadoGeral = estadoGeral;
    }

    public List<Amostra> getAmostra() {
        return amostra;
    }

    public void setAmostra(List<Amostra> amostra) {
        this.amostra = amostra;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
