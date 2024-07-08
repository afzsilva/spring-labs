package com.example.demofeignclientms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Biography {

    @JsonProperty("full-name")
    private String fullName;

    public Biography() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
