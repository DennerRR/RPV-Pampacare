package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Propriedade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "longitude")
    private String longitude;


    @Column(name="latitude")
    private String latitude;



    @ManyToOne
    private Bairro bairro;


    public Propriedade(long id, String longitude, String latitude, Bairro bairro) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.bairro = bairro;
    }

    public Propriedade() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }



    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}
