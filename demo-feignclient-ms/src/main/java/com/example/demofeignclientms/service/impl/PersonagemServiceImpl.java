package com.example.demofeignclientms.service.impl;

import com.example.demofeignclientms.dto.PersonagemResponse;
import com.example.demofeignclientms.dto.Results;
import com.example.demofeignclientms.service.PersonagemService;
import com.example.demofeignclientms.service.client.PersonagemClientService;
import com.example.demofeignclientms.utils.TextoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class PersonagemServiceImpl implements PersonagemService {

    @Autowired
    private PersonagemClientService personagemClientService;

    @Override
    public PersonagemResponse obterPersonagemPorId(int id) {
        return personagemClientService.obterDetalhesPersonagem(id);
    }

    @Override
    public List<PersonagemResponse> obterListaPersonagemsContendoDescricao(String nome) {
        if(!TextoUtil.validarString(nome)){
            throw new RuntimeException("Valor de parametro Inexistente");
        }
        Results results = personagemClientService.listarPersonagemsPorNome(nome);
        return results.getResults();
    }
}
