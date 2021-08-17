package com.rp5.etl.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Cao> cao;
}
