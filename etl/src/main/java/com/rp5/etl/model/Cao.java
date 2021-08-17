package com.rp5.etl.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_Cao")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column
    private boolean coleira;

    private boolean vivo;

    private String sexo;

    private String estadoGeral;

    @ManyToOne(cascade = CascadeType.ALL)
    private Proprietario proprietario;

    @OneToOne(cascade = CascadeType.ALL)
    private Raca raca;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Amostra> amostras;

}
