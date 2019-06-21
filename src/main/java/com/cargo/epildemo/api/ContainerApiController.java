package com.cargo.epildemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContainerApiController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
