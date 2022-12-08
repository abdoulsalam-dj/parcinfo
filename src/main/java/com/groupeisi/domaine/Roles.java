package com.groupeisi.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {
    private int id;
    @NotNull(message = "Le nom ne doit pas etre null")
    private String nom;
}
