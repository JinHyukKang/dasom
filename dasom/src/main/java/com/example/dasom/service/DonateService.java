package com.example.dasom.service;

import com.example.dasom.domain.dto.DonateDto;
import com.example.dasom.mapper.DonateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DonateService {
    private final DonateMapper donateMapper;

    @Transactional
    public void donation(DonateDto donateDto){
        donateMapper.insert(donateDto);
    }

}
