package com.{{cookiecutter.project_slug}};

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from {{cookiecutter.project_name}}!";
    }
}
