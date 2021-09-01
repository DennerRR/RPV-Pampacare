package com.rp5.crudservice.dto;

import java.util.Date;

public class ExameDTO {

    private Date data;
   // private String nome;


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