package com.core.microservices.core.user.services;

import com.core.api.core.user.UserDTO;
import com.core.microservices.core.user.persistence.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(target = "id", ignore = true)
    UserEntity dtoToEntity(UserDTO userDTO);

    UserDTO entityToDto(UserEntity newEntity);
}
