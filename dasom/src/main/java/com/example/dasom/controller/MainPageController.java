package com.example.dasom.controller;

import com.example.dasom.service.MainPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/*")
@RequiredArgsConstructor
public class MainPageController {

    private final MainPageService mainPageService;

    @GetMapping("/mainPage")
    public String main(Model model){

        model.addAttribute("donateList", mainPageService.findDonateAll());
        model.addAttribute("csList", mainPageService.findCsAll());
        return "mainPage";

    }


}
