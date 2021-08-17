package com.rp5.condicao.model;

import javax.persistence.*;

@Entity
public class Condicao {

        @Id
        @Column(name = "id", unique = true, nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;

    }
