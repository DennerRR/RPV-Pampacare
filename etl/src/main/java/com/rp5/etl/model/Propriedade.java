package com.rp5.etl.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Propriedade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String longitude;

    private String latitude;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Proprietario> proprietario;

    @OneToOne(cascade = CascadeType.ALL)
    private Bairro bairro;

}
