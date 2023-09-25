package com.example.dasom.mapper;

import com.example.dasom.domain.dto.DonateDto;
import com.example.dasom.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DonateMapper {
//    회원명 가져오기
    public UserDto selectUsers(Long userNumber);

//    캠페인명 가져오기
    public DonateDto selectCampaign(Long donateWriteNumber);

//    후원금
    public void insert(DonateDto donateDto);

}
