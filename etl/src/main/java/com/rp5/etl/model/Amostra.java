package com.rp5.etl.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Amostra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date data;

    @OneToOne
    private Cao cao;

}
