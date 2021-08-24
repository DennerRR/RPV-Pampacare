package com.rp5.crudservice.model;

import javax.persistence.*;

@Entity
public class Propriedade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "longitude")
    private String longitude;


    @Column(name="latitude")
    private String latitude;

    public Propriedade(long id, String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.id = id;
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
}
