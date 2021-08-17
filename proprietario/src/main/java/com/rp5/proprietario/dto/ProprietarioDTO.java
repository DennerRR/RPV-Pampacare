package com.rp5.proprietario.dto;

public class ProprietarioDTO {
    private String nome;

    public ProprietarioDTO(String nome) {
        this.nome = nome;
    }

    public ProprietarioDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
