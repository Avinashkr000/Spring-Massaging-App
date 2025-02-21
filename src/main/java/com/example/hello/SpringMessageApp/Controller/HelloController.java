package com.example.hello.SpringMessageApp.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(defaultValue = "User") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}