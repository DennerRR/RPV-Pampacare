package com.rp5.crudservice.dto;

public class CondicaoDTO {

    private String nome;


    public CondicaoDTO(String nome) {
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
