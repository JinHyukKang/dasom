package com.example.dasom.controller.cs;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
@RequestMapping("/cs")
public class CsListController {
    
    @GetMapping("/list")
    public String showList(){
        return  "cs/csList/csList";
    }

    @GetMapping("/detail")
}
