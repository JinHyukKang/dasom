package com.example.dasom.controller.donate;

import com.example.dasom.service.DonateListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

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
    public String donationDetail(@RequestParam("donateWriteTitle")String donateWriteTitle, Model model, HttpServletRequest req){
        Long  userNumber = (Long)req.getSession().getAttribute("userNumber");
            String userName = donateListService.selectKakaoUserName(userNumber);
            model.addAttribute("userName", userName);
            model.addAttribute("donateWriteTitle", donateWriteTitle);

        return "donation/donationPay/donationPay";
    }

    @GetMapping("/complete")
    public String donationComplete(){
        return "donation/donationComplete/donationComplete";
    }


}
