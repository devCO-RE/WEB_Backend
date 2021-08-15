package com.core.microservices.core.user.services;

import com.core.api.core.user.User;
import com.core.api.core.user.UserService;
import com.core.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    private final ServiceUtil serviceUtil;

    @Autowired
    public UserServiceImpl(ServiceUtil serviceUtil){
        this.serviceUtil = serviceUtil;
    }

    @Override
    public User getUser(int userId){
        return new User(userId, "youyou", "123", "name-"+userId, null, "123", null, null, false, serviceUtil.getServiceAddress());
    }


}
