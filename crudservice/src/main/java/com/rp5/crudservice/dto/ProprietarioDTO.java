package com.rp5.crudservice.dto;

public class ProprietarioDTO {
    private String nome;
    private Long idPropriedade;

    public ProprietarioDTO(String nome, Long idPropriedade) {
        this.nome = nome;
        this.idPropriedade = idPropriedade;
    }

    public ProprietarioDTO() {
    }

    public Long getIdPropriedade() {
        return idPropriedade;
    }

    public void setIdPropriedade(Long idPropriedade) {
        this.idPropriedade = idPropriedade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
