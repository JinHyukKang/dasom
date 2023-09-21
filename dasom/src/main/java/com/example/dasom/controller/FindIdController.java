package com.example.dasom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/find/*")
public class FindIdController {

    @GetMapping("/findId")
    public String mainLogin(){
        return "login/find/findId";

    }
}
