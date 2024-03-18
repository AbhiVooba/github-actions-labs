package com.labs.sboot.ci.sbootcilabs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sbootController {
    @GetMapping("/greetings")
    public String hello() {
        return ("Hello from sbootController");
    }
}
