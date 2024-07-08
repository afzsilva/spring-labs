package com.example.demo_mapstruct.config;

import org.springframework.stereotype.Component;

@Component
public class HandleText {
    public String upperText(String text){
        return text.toUpperCase();
    }
}
