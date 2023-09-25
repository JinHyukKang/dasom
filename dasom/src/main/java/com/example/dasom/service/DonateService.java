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
        if (donateDto == null) {
            throw new IllegalArgumentException("로그인 안 됨");
        }
        donateMapper.insert(donateDto);
    }

    //     카카오페이 페이지에 입력될 유저이름 출력
    public String selectName(Long userNumber){
        return donateMapper.selectName(userNumber);
    };


}
