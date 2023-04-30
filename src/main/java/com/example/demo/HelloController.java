package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {

        var response = new HelloResponse("Hello World!");
        return ResponseEntity.ok(response);
    }
}
