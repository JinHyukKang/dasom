package com.example.dasom.mapper;

import com.example.dasom.domain.dto.DonateFileDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DonateFileMapper {
//    후원글 작성 이미지 업로드
    public void insert(DonateFileDto donateFileDto);
}
