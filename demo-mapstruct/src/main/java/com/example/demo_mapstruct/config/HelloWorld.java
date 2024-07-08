package com.example.demo_mapstruct.config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @PostConstruct
    public void mensagem(){
        System.out.println("Hello World java e spring");
    }

}
