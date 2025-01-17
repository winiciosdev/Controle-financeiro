package com.financaoliveira.controle_financeiro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                .info(New Info().title("API Controle Financeiro")
                        .version("1.0")
                        .description("Documentação da minha API de controle financeiro"))
    }
}
