package com.example.dasom.mapper;

import com.example.dasom.domain.dto.CsDto;
import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.domain.vo.DonateListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CsListMapper {

    //    봉사 리스트 전체 게시글 개수 조회
//    public int selectTotal();

    //     기부 리스트 전체 게시글 조회
    public List<CsWriteDto> selectList(String status);
}
