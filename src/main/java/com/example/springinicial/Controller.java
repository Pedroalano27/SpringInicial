package com.example.springinicial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/BoasVindas")
    public String Boasvindas() {
        return "Bem-vindo ao Spring Boot!";
    }
}
