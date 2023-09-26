package com.example.dasom.controller.cs;

import com.example.dasom.domain.dto.CsDto;
import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.service.CsListService;
import com.example.dasom.service.DonateListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/csRest")
@Slf4j
public class CsListRestController {
    private final CsListService csListService;
    private final DonateListService donateListService;

    @GetMapping(value = {"/{status}"})
    public List<CsWriteDto> showList(@PathVariable("status")String status){
        return csListService.showList(status);
    }

    //    봉사신청 완료페이지
    @GetMapping("/csComplete/{csNum}")
    public boolean csComplete(@PathVariable("csNum")Long csWriteNumber, HttpServletRequest req, Model model){
        //봉사 신청자 이름
        Long  userNumber = (Long)req.getSession().getAttribute("userNumber");
        String userName = donateListService.selectKakaoUserName(userNumber);

        // 중복체크 후 기부 테이블에 DB삽입
        boolean duplicateCheck = csListService.csApply(userNumber,csWriteNumber);

      return duplicateCheck;

    }

}
