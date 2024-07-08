package com.example.demofeignclientms.controller;

import com.example.demofeignclientms.dto.PersonagemResponse;
import com.example.demofeignclientms.service.PersonagemService;
import com.example.demofeignclientms.service.client.PersonagemClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personagem")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @GetMapping("/{id}")
    public ResponseEntity<PersonagemResponse> personagem(@PathVariable("id") int id){
        PersonagemResponse personagemResponseDTO = personagemService.obterPersonagemPorId(id);
        return ResponseEntity.ok(personagemResponseDTO);
    }

    @GetMapping("/buscar/{descricao}")
    public ResponseEntity<List<PersonagemResponse>> personagemsList(@PathVariable("descricao") String descricao){
        return ResponseEntity.ok(personagemService.obterListaPersonagemsContendoDescricao(descricao));
    }

    /**
     *
     * @param nome
     * @return Lista de PersonagemResponse
     *
     * @Exception MissingServletRequestParameterException (caso informar parametro errado)
     */
    @GetMapping("/buscar")
    public ResponseEntity<List<PersonagemResponse>> personagemsList2(@RequestParam("nome") String nome){
        return ResponseEntity.ok(personagemService.obterListaPersonagemsContendoDescricao(nome));
    }
}
