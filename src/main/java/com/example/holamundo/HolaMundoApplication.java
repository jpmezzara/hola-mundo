package com.example.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HolaMundoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundoApplication.class, args);
    }

    @RestController
    class HolaController {

        @GetMapping("/hola")
        public String hola() {
            return "Hola mundo !";
        }
    }
}
