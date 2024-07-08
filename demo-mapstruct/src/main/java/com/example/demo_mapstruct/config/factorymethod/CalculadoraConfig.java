package com.example.demo_mapstruct.config.factorymethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculadoraConfig{
    
    @Bean
    Calculadora calculadora(){
        Calculadora calculadora = new Calculadora();
        return calculadora;
    }
    
}
