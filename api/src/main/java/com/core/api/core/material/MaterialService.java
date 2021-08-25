package com.core.api.core.material;

import java.util.List;

import com.core.api.core.payload.FileUploadResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

public interface MaterialService {

    //upload material
    //have to parse token later
    @CrossOrigin(origins = "*")
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(
            value = "/material/{userId}"
            // consumes = "application/json",
            // produces = "application/json"
    )
    FileUploadResponse sendMaterial(
                                    @RequestPart("file") MultipartFile file,
                                    @RequestParam("webUrl") String webUrl,
                                    @PathVariable int userId
                                    );


    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(
        value = "/material"
        // consumes = "application/json",
        // produces = "application/json"
    )
    @CrossOrigin(origins = "*")
    FileUploadResponse sendMaterial1(
        @RequestPart("file") MultipartFile file
    );

    // user-composite로 대 통합 필요
    @CrossOrigin(origins = "*")
    @GetMapping(
        value = "/user/{userId}/report",
        produces = "application/json")
    List<ReportDTO> getReportList(@PathVariable int userId);
}
