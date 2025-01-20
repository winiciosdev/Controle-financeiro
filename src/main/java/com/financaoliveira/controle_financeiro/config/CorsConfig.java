package com.financaoliveira.controle_financeiro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //Indicação de que essa classe é uma configuração do spring
public class CorsConfig {

    @Bean //definindo um bean gerenciado pelo Spring
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**")//Aplicando regras de CORS para todos os endpoints
                        .allowedOrigins("http://localhost:300")/*Define quais origens podem acessar a API
                                                                lembrar de alterar para dominio frontend*/
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")//Definindo os métodos HTTP permitidos
                        .allowedHeaders("*"); //Permitindo qualquer cabeçalho na requisição
            }
        };
    }
}
