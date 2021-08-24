package com.rp5.crudservice.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Amostra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date data;

    @ManyToOne
    private Cao cao;

    @ManyToMany
    private List<Exame> exame;

    public Amostra(long id, Date data, Cao cao, List<Exame> exame) {
        this.id = id;
        this.data = data;
        this.cao = cao;
        this.exame = exame;
    }

    public Amostra() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cao getCao() {
        return cao;
    }

    public void setCao(Cao cao) {
        this.cao = cao;
    }

    public List<Exame> getExame() {
        return exame;
    }

    public void setExame(List<Exame> exame) {
        this.exame = exame;
    }
}
