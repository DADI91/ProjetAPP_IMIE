package com.imie.api.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Data
@Entity
@Table(name = "type_salle")
public class Type_Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Type_Salle")
    private Long idTypeSalle;

    private String Type_Salle;


    public Type_Salle() {
    }
}
