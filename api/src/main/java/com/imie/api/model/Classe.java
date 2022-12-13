package com.imie.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "classe")
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idClasse", nullable = false)
    private Long idClasse;

    @Column(name = "nomClasse")
    private String nomClasse;

    @Column(name = "nb_Place")
    private Long nbPlace;

    public Classe() {
    }

    public Classe(Long idClasse, String nomClasse, Long nbPlace) {
        this.idClasse = idClasse;
        this.nomClasse = nomClasse;
        this.nbPlace = nbPlace;
    }
}
