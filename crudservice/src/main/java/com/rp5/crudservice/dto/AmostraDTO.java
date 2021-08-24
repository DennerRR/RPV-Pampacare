package com.rp5.crudservice.dto;

import com.rp5.crudservice.model.Cao;
import com.rp5.crudservice.model.Exame;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class AmostraDTO {


    private Date data;


    private Long idCao;


    private Long idExame;

    public AmostraDTO( Date data, Long idCao, Long idExame) {

        this.data = data;
        this.idCao = idCao;
        this.idExame = idExame;
    }

    public AmostraDTO() {
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getIdCao() {
        return idCao;
    }

    public void setIdCao(Long idCao) {
        this.idCao = idCao;
    }

    public Long getIdExame() {
        return idExame;
    }

    public void setIdExame(Long idExame) {
        this.idExame = idExame;
    }
}
