package com.example.dasom.mapper;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.domain.vo.DonateListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DonateListMapper {

//     기부 리스트 전체 게시글 개수 조회
    public int selectTotal();

//     기부 리스트 전체 게시글 조회
    public List<DonateListVo> selectList(String status);

//    카카오페이 페이지에 입력될 유저이름 출력
    public String selectKakaoUserName(Long UserNumber);

}
