package com.core.microservices.core.material;

import com.core.microservices.core.material.property.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties({
		FileUploadProperties.class
})
@ComponentScan("com.core")
public class MaterialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaterialServiceApplication.class, args);
	}

}
