package com.example.dasom.mapper;

import com.example.dasom.domain.dto.CsWriteDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CsWriteMapper {

//    봉사글 작성
    public void insert(CsWriteDto csWriteDto);
}
