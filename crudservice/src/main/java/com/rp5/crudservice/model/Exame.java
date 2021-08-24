package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private Date data;

    public Exame(Long id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Exame() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}