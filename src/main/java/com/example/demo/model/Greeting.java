package com.example.demo.model;

import lombok.Data;

@Data
public class Greeting {
    private String saudacao;

    public Greeting(){
        this.saudacao ="Aoba";
    }

}
