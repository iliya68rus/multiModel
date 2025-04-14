package com.example.multimodel.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Value("${app2.host:http://localhost:8082}")
    private String app2Host;

    @GetMapping
    public String test() {
        var restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(app2Host, String.class);

        System.out.println("app1");
        return "app1, ответ от app2 = " + response;
    }
}
