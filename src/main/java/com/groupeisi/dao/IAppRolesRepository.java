package com.groupeisi.dao;

import com.groupeisi.entities.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRolesRepository extends JpaRepository<RolesEntity, Integer> {
}

