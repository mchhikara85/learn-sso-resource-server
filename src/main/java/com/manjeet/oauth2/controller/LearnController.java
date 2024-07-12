package com.manjeet.oauth2.controller;

import com.manjeet.oauth2.model.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnController {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> hello() {
        return ResponseEntity.ok(new HelloResponse("Hello from Manjeet"));
    }
}