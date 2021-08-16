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
    public FileUploadResponse sendMaterial(int userId, MultipartFile file, MaterialDTO materialDTO) {
        //have to add try catch later
        String fileName = service.storeFile(file);
//        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("/downloadFile/")
//                .path(fileName)
//                .toUriString();
//
//        return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
        return null;
    }

}
