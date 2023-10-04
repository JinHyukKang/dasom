package com.example.dasom.mapper;

import com.example.dasom.domain.vo.AdDonateVo;
import com.example.dasom.domain.vo.Criteria;
import com.example.dasom.domain.vo.SearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdDonateMapper {

//    후원내역조회
    public List<AdDonateVo> selectAll(Criteria criteria, SearchVo searchVo);
//    후원수 조회
    public int selectTotal(SearchVo searchVo);

}
