package com.rp5.etl.model;

import javax.persistence.*;

@Entity
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "area")
    private String area;

    private String rua;

    private int numero;

    private String complemento;

    private String nome;
}
