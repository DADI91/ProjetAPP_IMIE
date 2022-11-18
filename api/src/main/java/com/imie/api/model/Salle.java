package com.imie.api.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "salle")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Numero", nullable = false)
    private Long numero;

    @Column(name = "nom")
    private String nom;

    @Column(name = "Places")
    private Long places;

    @ManyToOne()
    @JoinColumn(name = "Id_Type_Salle")
    private Type_Salle typeSalle;

    public Long getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getPlaces() {
        return places;
    }

    public Type_Salle getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(Type_Salle typeSalle) {
        this.typeSalle = typeSalle;
    }

    public void setPlaces(Long places) {
        this.places = places;
    }

    public Salle() {
    }

    public Salle(Long numero, String nom, Long places ) {
        this.numero = numero;
        this.nom = nom;
        this.places = places;
    }
}
