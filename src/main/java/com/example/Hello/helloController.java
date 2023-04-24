package com.example.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
