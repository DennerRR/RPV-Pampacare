package com.rp5.crudservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Condicao {

        @Id
        @Column(name = "id", unique = true, nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nome_Condicao")
        private String nome;

        @OneToMany
        private List<Cao> cao;

        public Condicao(Long id, String nome, List<Cao> cao) {
                this.id = id;
                this.nome = nome;
                this.cao = cao;
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

        public List<Cao> getCao() {
                return cao;
        }

        public void setCao(List<Cao> cao) {
                this.cao = cao;
        }
}
