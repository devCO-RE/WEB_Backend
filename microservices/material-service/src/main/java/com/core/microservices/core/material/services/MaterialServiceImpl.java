package com.core.microservices.core.material.services;

import com.core.api.core.material.MaterialDTO;
import com.core.api.core.material.MaterialService;
import com.core.api.core.payload.FileUploadResponse;
import com.core.microservices.core.material.persistence.MaterialRepository;
import com.core.util.http.ServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class MaterialServiceImpl implements MaterialService {

    private static final Logger LOG = LoggerFactory.getLogger(MaterialServiceImpl.class);

    private final MaterialRepository repository;

    private final MaterialMapper mapper;

    private final ServiceUtil serviceUtil;

    private final MaterialUploadService service;

    @Autowired
    public MaterialServiceImpl(MaterialRepository repository, MaterialMapper mapper, ServiceUtil serviceUtil, MaterialUploadService service) {
        this.repository = repository;
        this.mapper = mapper;
        this.serviceUtil = serviceUtil;
        this.service = service;
    }

    @Override
    public FileUploadResponse sendMaterial(MultipartFile file, String webUrl, int userId) {
        //have to add try catch later
        System.out.println(webUrl + " : " + userId);
        String fileName = service.storeFile(file);

        // String fileDownloadUri = UriComponentsBuilder.newInstance()
        //     .scheme("http")
        //     .host("172.20.176.1")
        //     .port(7002)
        //     .path("/downloadFile/")
        //     .path(fileName)
        //     .toUriString();

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
            .path("/downloadFile/")
            .path(fileName)
            .toUriString();

        return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }

    @Override
    public FileUploadResponse sendMaterial1(MultipartFile file) {
        //have to add try catch later
        System.out.println(file.getName());
        String fileName = service.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
            .path("/downloadFile/")
            .path(fileName)
            .toUriString();

        return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }


}
