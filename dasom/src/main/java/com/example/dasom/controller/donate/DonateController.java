package com.example.dasom.controller.donate;

import com.example.dasom.service.DonateService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donate/*")
public class DonateController {
    private final DonateService donateService;

    @GetMapping("/list")
    public String showList(){
        return "donation/donationList/donationList";
    }
}
