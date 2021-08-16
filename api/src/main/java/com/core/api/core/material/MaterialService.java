package com.core.api.core.material;

import com.core.api.core.payload.FileUploadResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    FileUploadResponse sendMaterial(@PathVariable int userId,
                                    @RequestParam("file") MultipartFile file,
                                    @RequestBody MaterialDTO materialDTO);
}
