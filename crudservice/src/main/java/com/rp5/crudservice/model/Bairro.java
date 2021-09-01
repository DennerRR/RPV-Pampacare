package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String area;
    private String rua;
    private int numero;
    private String complemento;
    private String nome;


    public Bairro(long id, String area, String rua, int numero, String complemento, String nome) {
        this.id = id;
        this.area = area;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.nome = nome;
    }

    public Bairro() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
