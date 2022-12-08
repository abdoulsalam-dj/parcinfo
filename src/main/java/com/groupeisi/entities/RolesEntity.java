package com.groupeisi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolesEntity {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(unique = true,nullable = false,length = 100)
    private String Nom;
    @ManyToMany(mappedBy = "appRoles")
    private List<UserEntity> appUser;
}
