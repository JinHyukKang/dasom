package com.example.dasom.controller.donate;

import com.example.dasom.service.DonateListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donate/*")
public class DonateListController {
    private final DonateListService donateListService;

    @GetMapping("/list")
    public String showList(){
        return "donation/donationList/donationList";
    }

    @GetMapping("/detail")
    public String donationDetail(){
        return "donation/donationPay/donationPay";
    }

    @GetMapping("/complete")
    public String donationComplete(){
        return "donation/donationComplete/donationComplete";
    }


}
