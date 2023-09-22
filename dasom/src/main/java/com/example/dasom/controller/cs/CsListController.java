package com.example.dasom.controller.cs;

import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.service.CsListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;
import java.util.List;

@Component
@RequiredArgsConstructor
@RequestMapping("/cs")
public class CsListController {
    private final CsListService csListService;

//    봉사 게시판 리스트출력
    @GetMapping("/list")
    public String showList(){
        return  "cs/csList/csList";
    }

// 오류잡기 추가하기!!
//    봉사 게시글 상세보기
    @GetMapping("/detail")
    public String showDetail(@RequestParam("csNum")Long csNum , Model model){
        CsWriteDto csDto = csListService.showDetail(csNum);
        model.addAttribute("csInfo", csDto);
        model.addAttribute("csNum",csNum);
        return "cs/csDetail/csDetail";
    }

//    봉사신청 완료페이지
    @GetMapping("/csComplete")
    public void csComplete(@RequestParam("csNum")Long csNum, HttpRequest req, Model model){

    }
}
