package com.rp5.exame.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private Date data;

    public Exame() {
    }

    public Exame(Long id, String nome, Date data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
