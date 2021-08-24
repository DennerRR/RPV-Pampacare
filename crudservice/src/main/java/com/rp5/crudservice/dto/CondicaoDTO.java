package com.rp5.crudservice.dto;

public class CondicaoDTO {
    private long id;
    private String nome;
    private Long idCao;

    public CondicaoDTO(long id, String nome, Long idCao) {
        this.id = id;
        this.nome = nome;
        this.idCao = idCao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdCao() {
        return idCao;
    }

    public void setIdCao(Long idCao) {
        this.idCao = idCao;
    }
}
