package com.example.dasom.controller;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.service.MyPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/myPage/*")
@RequiredArgsConstructor
@Slf4j
public class MyPageRestController {


//    @PostMapping("/changePh")
//    public String changeph(){
//
//        return null;
//    }


}
