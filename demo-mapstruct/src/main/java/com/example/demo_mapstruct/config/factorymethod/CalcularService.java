package com.example.demo_mapstruct.config.factorymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalcularService {

    private Calculadora calculadora;

//    public CalcularService(Calculadora calculadora) {
//        this.calculadora = calculadora;
//    }

    public void somar(int x, int y){

        System.out.println(calculadora.soma(x,y));
    }

    @Autowired
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
