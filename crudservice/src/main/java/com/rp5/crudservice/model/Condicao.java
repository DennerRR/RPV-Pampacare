package com.rp5.crudservice.model;

import javax.persistence.*;

@Entity
public class Condicao {

        @Id
        @Column(name = "id", unique = true, nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nome_Condicao")
        private String nome;

        public Condicao(Long id, String nome) {
                this.id = id;
                this.nome = nome;
        }

        public Condicao() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }


    }
