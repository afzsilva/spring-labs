package com.example.demofeignclientms.dto;

public class PersonagemResponse {

    private String name;

    private Biography biography;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }
}
