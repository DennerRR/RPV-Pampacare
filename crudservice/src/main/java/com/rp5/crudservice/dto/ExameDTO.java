package com.rp5.crudservice.dto;

import java.util.Date;

public class ExameDTO {

    private Date data;
    private Long idExame;

    public ExameDTO(Date data, Long idExame) {
        this.data = data;
        this.idExame = idExame;
    }

    public ExameDTO() {
    }

    public Long getIdExame() {
        return idExame;
    }

    public void setIdExame(Long idExame) {
        this.idExame = idExame;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}