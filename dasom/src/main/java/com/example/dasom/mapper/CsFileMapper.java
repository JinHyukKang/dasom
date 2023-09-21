package com.example.dasom.mapper;

import com.example.dasom.domain.dto.CsFileDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CsFileMapper {
//    봉사글 작성 이미지 업로드
    public void insert(CsFileDto csFileDto);
}
