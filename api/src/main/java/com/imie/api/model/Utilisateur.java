package com.imie.api.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdUtilisateur", nullable = false)
    private Long idUtilisateur;

    private String UserID;

    private String password;

    @Column(name="idClasse")
    private Integer idClasse;

    @ManyToOne()
    @JoinColumn(name = "ID_Type_User")
    private Type_User typeUser;

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Utilisateur() {
    }

    public Utilisateur(Long IdUtilisateur, String UserID, String password, Integer idClasse) {
        this.idUtilisateur = IdUtilisateur;
        this.UserID = UserID;
        this.password = password;
        this.idClasse = idClasse;
    }

}
