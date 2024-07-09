package com.example.demowiremock.service.client;

import com.example.demowiremock.dto.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BuscarEnderecoServiceImpl implements BuscarEnderecoService{

    @Autowired
    private BuscarEnderecoClient client;

    @Override
    public EnderecoResponse buscar() {
        return client.retornarEndereco();
    }
}
