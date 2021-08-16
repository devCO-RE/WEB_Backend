package com.core.microservices.core.user.services;

import com.core.api.core.user.UserDTO;
import com.core.api.core.user.UserService;
import com.core.microservices.core.user.persistence.UserEntity;
import com.core.microservices.core.user.persistence.UserRepository;
import com.core.util.exceptions.InvalidInputException;
import com.core.util.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository repository;

    private final UserMapper mapper;

    private final ServiceUtil serviceUtil;

    @Autowired
    public UserServiceImpl(UserRepository repository, UserMapper mapper, ServiceUtil serviceUtil){
        this.repository = repository;
        this.mapper = mapper;
        this.serviceUtil = serviceUtil;
    }
//    testing
//    @Override
//    public UserDTO getUser(int userId){
//        return new UserDTO( "youyou", "123", "name-"+userId, null, "123", null, null, false, serviceUtil.getServiceAddress());
//    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        try{
            UserEntity entity = mapper.dtoToEntity(userDTO);
            UserEntity newEntity = repository.save(entity);

            LOG.debug("createUser: created a user entity: {}", userDTO.getIdentity());
            return mapper.entityToDto(newEntity);

        }catch(DataIntegrityViolationException dive){
            throw new InvalidInputException("Duplicate key, User Identity :  " + userDTO.getIdentity());
        }
    }


}
