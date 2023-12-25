package com.example.multimodel.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @GetMapping
    public String test() {
        var restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8082", String.class);

        System.out.println("app1 ");
        return "app1, ответ от app2 = " + response;
    }
}
