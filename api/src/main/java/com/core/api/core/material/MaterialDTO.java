package com.core.api.core.material;

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
