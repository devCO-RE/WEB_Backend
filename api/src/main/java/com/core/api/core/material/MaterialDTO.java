package com.core.api.core.material;

import org.springframework.web.multipart.MultipartFile;

public class MaterialDTO {

    private final String webUrl;

    public MaterialDTO(){
        webUrl = "nothing";
    }
    public MaterialDTO(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }
}
