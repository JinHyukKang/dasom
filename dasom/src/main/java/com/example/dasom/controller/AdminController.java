package com.example.dasom.controller;

import com.example.dasom.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

//    관리자 로그인 페이지 이동
    @GetMapping("/adLogin")
    public String showAdminLogin(){
        return "admin/adLogin/adLogin";
    }

//    관리자 로그인
    @PostMapping("/login")
    public RedirectView login(String adminId, String adminPassword, HttpServletRequest req){
        Long adminNumber = adminService.selectAdminNumber(adminId, adminPassword);
        req.getSession().setAttribute("adminNumber", adminNumber);

        return new RedirectView("/admin/adUser");
    }

//    관리자페이지 후원 관리 이동
    @GetMapping("/adDonation")
    public String showAdDanation(){
        return "admin/adDonation/adDonation";
    }

//    관리자페이지 회원관리 이동
    @GetMapping("/adUser")
    public String showAdUser(){
        return "admin/adUser/adUser";
    }

//    관리자페이지 후원금리스트 페이지 이동
    @GetMapping("/adDonationList")
    public String showAdDonationList(){
        return "admin/adDonationList/adDonationList";
    }

//    관리자페이지 봉사글 관리 페이지 이동
    @GetMapping("/adCs")
    public String showAdCs(){
        return "admin/adCs/adCs";
    }







}
