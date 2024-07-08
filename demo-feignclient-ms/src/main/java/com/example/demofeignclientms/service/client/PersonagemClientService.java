package com.example.demofeignclientms.service.client;

import com.example.demofeignclientms.dto.PersonagemResponse;
import com.example.demofeignclientms.dto.Results;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Esta classe é responsável por acessar endpoints externos a aplicação
 * ou seja (fora do Eureka Server), que retorna JSON simples e complexo
 */
@Service
//@FeignClient(name = "personagemsdc", url = "${spring.cloud.config.uri}")
@FeignClient(name = "personagemsdc", url = "https://superheroapi.com/api/${TOKEN_API}")
public interface PersonagemClientService {

    /**
     *
     * @param id Tipo inteiro simples
     * @return Um objeto PersonagemResponse que representa um JSON aninhado
     */
    @GetMapping(value = "/{id}")
    PersonagemResponse obterDetalhesPersonagem(@PathVariable("id") int id);

    //TODO implementar paginado

    /**
     * @param nome tipo String
     * @return Um objeto Results que tem como atributo uma lista de PersonagemResponse
     */
    @GetMapping(value = "/search/{nome}")
    Results listarPersonagemsPorNome(@RequestParam("nome") String nome);
}
