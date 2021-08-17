package com.rp5.exame.dto;


public class ExameDTO {

    private Date data;

    public ExameDTO(Date data) {
        this.data = data;
    }

    public ExameDTO() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
