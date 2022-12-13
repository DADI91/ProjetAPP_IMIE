package com.imie.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "formation")
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idFormation", nullable = false)
    private Long idFormation;

    @Column(name = "NomFormation")
    private String nomFormation;

    @Column(name = "Date_Debut_Formation")
    private Date dateDebutFormation;

    @Column(name = "Date_Fin_Formation")
    private Date dateFinFormation;

    @OneToOne
    @JoinColumn(name = "Id_Formateur")
    private Formateur formateur;

    @OneToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;


}
