package com.spring.api.documentation.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
@Configuration
public class SwaggerConfig {


    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spring.api.documentation"))
                .paths(regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot Swagger API",
                "Spring Boot Swagger API ",
                "1.0",
                "Terms of Service",
                new Contact("Soumyadip Chowdhury", "https://soumyadip007.github.io/Resume/",
                        "soumyadip.note@gmail.com"),
                "Apache License Version 2.0",
                "https://github.com/soumyadip007/Swagger2-API-Documentation-using-Spring-Boot-and-Microservices"
        );

        return apiInfo;
    }
	
}
