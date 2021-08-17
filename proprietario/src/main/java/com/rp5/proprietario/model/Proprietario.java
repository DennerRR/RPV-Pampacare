package com.rp5.proprietario.model;

import javax.persistence.*;

@Entity
@Table(name = "proprietarios")
public class Proprietario {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

}
