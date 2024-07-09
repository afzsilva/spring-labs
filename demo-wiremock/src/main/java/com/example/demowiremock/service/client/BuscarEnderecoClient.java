package com.example.demowiremock.service.client;

import com.example.demowiremock.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;



@Service
@FeignClient(name = "enderecos", url = "${meumock.client.address.url}")
public interface BuscarEnderecoClient {

    @GetMapping(value = "/cep")
    EnderecoResponse retornarEndereco();
}
