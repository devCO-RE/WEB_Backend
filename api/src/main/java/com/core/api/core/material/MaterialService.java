package com.core.api.core.material;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface MaterialService {

    //upload material
    //후에 제보 대상은 token에서 parsing필요
    @CrossOrigin(origins = "*")
    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping(
            value = "/material/{userId}",
            consumes = "application/json",
            produces = "application/json"
    )
    MaterialDTO sendMaterial(@PathVariable int userId, @RequestBody MaterialDTO materialDTO);
}
