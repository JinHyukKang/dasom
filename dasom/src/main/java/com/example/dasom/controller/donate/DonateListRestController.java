package com.example.dasom.controller.donate;

import com.example.dasom.domain.vo.DonateListVo;
import com.example.dasom.service.DonateListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/donations")
@Slf4j
public class DonateListRestController {
    private final DonateListService donateListService;

    @GetMapping(value = {"/{status}"})
    public List<DonateListVo> showList(@PathVariable("status") String status){
        log.info(status);
        return donateListService.showList(status);
    }



}
