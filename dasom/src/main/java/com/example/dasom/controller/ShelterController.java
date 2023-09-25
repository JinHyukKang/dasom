package com.example.dasom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shelter/*")
@RequiredArgsConstructor
public class ShelterController {

    @GetMapping("/shelter")
    public String showShelter(){
        return "include/mapApi";
    }

    @GetMapping("/shelterLogin")
    public String showShelterLogin(){
        return "include/mapApiLogin";
    }
}
