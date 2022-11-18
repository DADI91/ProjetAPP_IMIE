package com.imie.api.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "formateur")
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Formateur", nullable = false)
    private Long idFormateur;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Prenom")
    private String prenom;

    @Column(name = "UserID_formateur")
    private String userIdFormateur;

    @Column(name = "password")
    private String password;

    public Formateur() {
    }

    public Formateur(Long idFormateur, String nom, String prenom, String userIdFormateur, String password ) {
        this.idFormateur = idFormateur;
        this.nom = nom;
        this.prenom = prenom;
        this.userIdFormateur = userIdFormateur;
        this.password = password;
    }
}
