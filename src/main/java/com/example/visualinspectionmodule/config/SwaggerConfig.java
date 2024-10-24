package com.example.visualinspectionmodule.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact()
                .name("JAYAKISHORE")
                .email("jayakishore7077@gmail.com");

        Info info = new Info()
                .title("Visual Inspection API")
                .version("1.0")
                .description("API for Visual Inspection")
                .contact(contact);

        return new OpenAPI().info(info);
    }
}
