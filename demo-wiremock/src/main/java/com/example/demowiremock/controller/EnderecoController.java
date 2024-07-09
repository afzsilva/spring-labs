package com.example.demowiremock.controller;

import com.example.demowiremock.dto.EnderecoResponse;
import com.example.demowiremock.service.client.BuscarEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cep")
public class EnderecoController {

    @Autowired
    private BuscarEnderecoService service;

    @GetMapping
    public ResponseEntity<EnderecoResponse> enderecoMock(){
        return ResponseEntity.ok(service.buscar());
    }

}
