package com.example.dasom.controller.cs;

import com.example.dasom.domain.dto.CsDto;
import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.service.CsListService;
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
@RequestMapping("/csRest")
@Slf4j
public class CsListRestController {
    private final CsListService csListService;

    @GetMapping(value = {"/{status}"})
    public List<CsWriteDto> showList(@PathVariable("status")String status){
        return csListService.showList(status);
    }

}
