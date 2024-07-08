package com.example.AppFilm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AppFilmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppFilmApplication.class, args);
    }

    @RestController
    static class HelloController {
        
        @GetMapping("/hello")
        public String helloSpring() {
            return "Hello Spring!";
        }
    }
}

