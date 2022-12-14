package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    
    @GetMapping
    public ResponseEntity<String> digaOla(){
        Greeting greeting = new Greeting();
        return ResponseEntity.ok (greeting.getSaudacao());
    }
}
