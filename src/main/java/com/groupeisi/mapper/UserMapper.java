package com.groupeisi.mapper;
import com.groupeisi.domaine.User;
import com.groupeisi.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    User toAppUser(UserEntity appUserEntity);
    UserEntity fromAppUser(User appUser);
}
