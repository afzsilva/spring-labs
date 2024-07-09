package com.example.demowiremock.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoResponse {

    @JsonProperty("street")
    private String street;

    @JsonProperty("cidade")
    private String cidade;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
