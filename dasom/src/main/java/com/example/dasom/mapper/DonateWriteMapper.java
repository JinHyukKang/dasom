package com.example.dasom.mapper;

import com.example.dasom.domain.dto.DonateWriteDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DonateWriteMapper {

//    후원글 작성
    public void insert(DonateWriteDto donateWriteDto);
}
