package com.core.api.core.material;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface MaterialService {

    //upload material
    //have to parse token later
    @CrossOrigin(origins = "*")
    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(
            value = "/material/{userId}",
            consumes = "application/json",
            produces = "application/json"
    )
    MaterialDTO sendMaterial(@PathVariable int userId, @RequestBody MaterialDTO materialDTO);
}
