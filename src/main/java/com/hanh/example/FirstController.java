package com.hanh.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "this is my first controller";
    }

    @PostMapping("/post")
    public String firstPost(@RequestBody String mess) {
        return "first post " + mess;
    }

    @PostMapping("/post-order")
    public String PostOrder(@RequestBody Order order) {
        return "first post order: " + order;
    }
}
