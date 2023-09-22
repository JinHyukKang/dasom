package com.example.dasom.mapper;

import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.domain.vo.Criteria;
import com.example.dasom.domain.vo.SearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DonateWriteMapper {

//    후원글 작성
    public void insert(DonateWriteDto donateWriteDto);
//    후원글 전체 조회
    public List<DonateWriteDto> selectAll(Criteria criteria, SearchVo searchVo);
//    전체 후원글 수 조회
    public int selectTotal(@Param("keyword") String keyword);
}
