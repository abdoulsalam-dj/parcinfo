package com.groupeisi.mapper;

import com.groupeisi.domaine.Roles;
import com.groupeisi.entities.RolesEntity;
import org.mapstruct.Mapper;

@Mapper
public interface RolesMapper {
    Roles toAppRoles(RolesEntity appRolesEntity);
    RolesEntity fromAppRoles(Roles appRoles);
}
