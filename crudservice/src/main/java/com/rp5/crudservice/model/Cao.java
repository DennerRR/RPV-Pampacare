package com.rp5.crudservice.model;

import javax.persistence.*;

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

    public Cao() {
    }

    public Cao(Long id, String nome, int idade, boolean coleira, boolean vivo, String sexo, String estadoGeral) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.coleira = coleira;
        this.vivo = vivo;
        this.sexo = sexo;
        this.estadoGeral = estadoGeral;
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
}
