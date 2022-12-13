package com.imie.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "planification")
public class Planification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Planification", nullable = false)
    private Long idPlanification;

    @Column(name = "Date_Debut")
    private Date dateDebut;

    @Column(name = "Date_Fin")
    private Date dateFin;

    @OneToOne
    @JoinColumn(name = "Numero")
    private Salle numero;

    @OneToOne
    @JoinColumn(name = "idClasse")
    private Classe idClasse;

    public Planification() {
    }

    public Planification(Date dateDebut, Date dateFin, Salle numero, Classe idClasse) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.numero = numero;
        this.idClasse = idClasse;
    }
}
