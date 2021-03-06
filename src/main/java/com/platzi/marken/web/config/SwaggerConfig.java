package com.platzi.marken.web.config;

import org.apache.coyote.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.platzi.marken.web.controller"))
                .build();

    }

    //Podemos especificar la documentacion del Swagger
    private ApiInfo apiEndoPointInfo(){
        return new ApiInfoBuilder().title("Api de Productos")
                .description("Servicios para la consulta de productos de un supermercado")
                .license("Apache 2.0")
                .version("1.0.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();

    }


}
