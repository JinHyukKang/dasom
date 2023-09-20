package com.example.dasom.controller.donate;

import com.example.dasom.domain.vo.DonateWriteVo;
import com.example.dasom.service.DonateService;
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
public class DonateRestController {
    private final DonateService donateService;

    @GetMapping(value = {"/{status}"})
    public List<DonateWriteVo> showList(@PathVariable("status") String status){
        log.info(status);
        return donateService.showList(status);
    }



}
