package com.imie.webapp.model;

import lombok.Data;

import java.util.Date;

@Data

public class Formation {


    private Long idFormation;

    private String nomFormation;

    private Date dateDebutFormation;

    private Date dateFinFormation;

    private Formateur formateur;

    private Classe classe;


}
