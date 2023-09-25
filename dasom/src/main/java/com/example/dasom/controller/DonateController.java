package com.example.dasom.controller;

import com.example.dasom.domain.dto.DonateDto;
import com.example.dasom.mapper.DonateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donate/*")
public class DonateController {
    private final DonateMapper donateMapper;

    @GetMapping("/pay")
    public String showPayPage(){
        return "donation/donationPay/donationPay";
    }

    @PostMapping("payPage")
    public String pay(DonateDto donateDto, Model model){
        donateMapper.insert(donateDto);
        model.addAttribute("campaign", donateDto.getDonateWriteNumber());
        model.addAttribute("user", donateDto.getUserNumber());
        return "donation/donationComplete";
    }
}
