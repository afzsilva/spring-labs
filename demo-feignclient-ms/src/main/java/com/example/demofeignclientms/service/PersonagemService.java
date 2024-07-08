package com.example.demofeignclientms.service;

import com.example.demofeignclientms.dto.PersonagemResponse;

import java.util.List;

public interface PersonagemService {

    PersonagemResponse obterPersonagemPorId(int id);

    List<PersonagemResponse> obterListaPersonagemsContendoDescricao(String descricao);
}
