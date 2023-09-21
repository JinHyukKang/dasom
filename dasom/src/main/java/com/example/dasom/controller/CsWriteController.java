package com.example.dasom.controller;

import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.service.CsWriteService;
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
@RequestMapping("/csWrite/*")
@RequiredArgsConstructor
public class CsWriteController {

    private final CsWriteService csWriteService;

//    관리자 봉사 모집 글 작성 페이지 이동
    @GetMapping("/write")
    public String showCsWrite(HttpServletRequest req){
        Long adminNumber = (Long)req.getSession().getAttribute("adminNumber");

        return adminNumber == null ? "admin/adLogin":"admin/adWrite/adWriteCs";
    }

//    봉사 글 작성
    @PostMapping("/write")
    public RedirectView csWrite(CsWriteDto csWriteDto, HttpServletRequest req, RedirectAttributes redirectAttributes,
                                @RequestParam("csWriteFile")MultipartFile file){
        Long adminNumber = (Long)req.getSession().getAttribute("adminNumber");

        csWriteDto.setAdminNumber(adminNumber);
        csWriteService.registerAndFileProc(csWriteDto, file);

        Long csWriteNumber = csWriteDto.getCsWriteNumber();

        redirectAttributes.addFlashAttribute("csWriteNumber", csWriteNumber);

        return new RedirectView("/admin/adCs");
    }
}
