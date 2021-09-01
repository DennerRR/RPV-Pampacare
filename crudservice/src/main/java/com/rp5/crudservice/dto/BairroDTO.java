package com.rp5.crudservice.dto;

import com.rp5.crudservice.model.Propriedade;

import javax.persistence.OneToMany;
import java.util.List;

public class BairroDTO {
    private String area;
    private String rua;
    private int numero;
    private String complemento;
    private String nome;


    public BairroDTO(String area, String rua, int numero, String complemento, String nome) {
        this.area = area;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.nome = nome;
    }

    public BairroDTO() {
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
