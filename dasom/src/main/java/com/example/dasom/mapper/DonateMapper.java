package com.example.dasom.mapper;

import com.example.dasom.domain.vo.DonateWriteVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DonateMapper {

    //    기부 리스트 전체 게시글 개수 조회
    public int selectTotal();

    //     기부 리스트 전체 게시글 조회
    public List<DonateWriteVo> selectList(String status);
}
