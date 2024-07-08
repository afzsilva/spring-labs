package com.example.demofeignclientms.dto;

import java.util.List;

public class Results {

    private List<PersonagemResponse> results;

    public List<PersonagemResponse> getResults() {
        return results;
    }

    public void setResults(List<PersonagemResponse> results) {
        this.results = results;
    }
}
