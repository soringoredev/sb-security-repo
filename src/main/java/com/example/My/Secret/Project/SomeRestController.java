package com.example.My.Secret.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRestController {


    @GetMapping("/mesaj")
    public String message() {
        return "Salut de la David din Statele UNITE";
    }

}
