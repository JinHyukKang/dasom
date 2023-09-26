package com.example.dasom.controller;

import com.example.dasom.domain.dto.DonateDto;
import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.mapper.DonateMapper;
import com.example.dasom.service.DonateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donate/*")
@Slf4j
public class DonateController {
    private final DonateService donateService;


    @GetMapping("payPage")
    public String pay(@RequestParam("donateWriteTitle")String campaign, Long donateWriteNumber, Model model, HttpServletRequest req) {
        model.addAttribute("campaign", campaign);
        model.addAttribute("donateWriteNumber", donateWriteNumber);
        Long userNumber = (Long) req.getSession().getAttribute("userNumber");
        String name = donateService.selectName(userNumber);
        model.addAttribute("name", name);

        return "donation/donationPay/donationPay";
    }

    @GetMapping("/complete")
    public String donationSuccess(DonateDto donateDto, HttpServletRequest req, Model model){
        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        donateDto.setUserNumber(userNumber);
        donateService.donation(donateDto);
        String userName = donateService.selectName(userNumber);
        model.addAttribute("userName", userName);
        return "donation/donationComplete/donationComplete";
    }


}
