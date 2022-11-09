package com.imie.api.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Data
@Entity
@Table(name = "type_user")
public class Type_User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Type_User", nullable = false)
    private Long idTypeUser;

    private String Type_User;

    public void setIdTypeUser(Long idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    public Type_User() {
    }

}
