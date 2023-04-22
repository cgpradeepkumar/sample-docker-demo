package com.example.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pradeepcg
 * @created 22/04/2023 - 07:12 AM
 */

@RestController
public class SampleController {

    @GetMapping("/test-docker-demo")
    public String getGreeting() {
        return "Hi user, I am Sample Docker Demo!";
    }
}
