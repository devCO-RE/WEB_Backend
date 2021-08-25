package com.core.api.core.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface UserService {

    //testing
    @CrossOrigin(origins = "*")
    @GetMapping(
            value = "/user/{userId}",
            produces = "application/json")
    UserDTO getUser(@PathVariable int userId);

    //user sign up
    @CrossOrigin(origins = "*")
    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(
            value = "/user/signup",
            consumes = "application/json",
            produces = "application/json"
    )
    UserDTO addUser(@RequestBody UserDTO userDTO);


}
