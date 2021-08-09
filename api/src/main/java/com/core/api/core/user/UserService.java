package com.core.api.core.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserService {

    //testing
    @GetMapping(
            value = "/user/{userId}",
            produces = "application/json")
        User getUser(@PathVariable int userId);

}
