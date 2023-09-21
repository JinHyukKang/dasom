package com.example.dasom.controller;

import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.service.DonateWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/donateWrite/*")
@RequiredArgsConstructor
public class DonateWriteController {

    private final DonateWriteService donateWriteService;

    //    관리자페이지 후원 글 작성 페이지 이동
    @GetMapping("/write")
    public String showDonateWrite(HttpServletRequest req){
        Long adminNumber = (Long)req.getSession().getAttribute("adminNumber");

        return adminNumber == null ? "admin/adLogin":"admin/adWrite/adWriteDonation";
    }

//    후원 글 작성
    @PostMapping("/write")
    public RedirectView donateWrite(DonateWriteDto donateWriteDto, HttpServletRequest req, RedirectAttributes redirectAttributes,
                                    @RequestParam("donateFile")MultipartFile file){
        Long adminNumber = (Long)req.getSession().getAttribute("adminNumber");

        donateWriteDto.setAdminNumber(adminNumber);
        donateWriteService.registerAndFileProc(donateWriteDto, file);

        Long donateWriteNumber = donateWriteDto.getDonateWriteNumber();

        redirectAttributes.addFlashAttribute("donateWriteNumber", donateWriteNumber);

        return new RedirectView("/admin/adDonation");
    }
}
