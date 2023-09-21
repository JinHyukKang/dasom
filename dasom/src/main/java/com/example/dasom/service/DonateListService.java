package com.example.dasom.service;

import com.example.dasom.domain.vo.DonateListVo;
import com.example.dasom.mapper.DonateListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonateListService {
    private final DonateListMapper donateListMapper;

//    기부 페이지 전체 게시글 수 조회
    public int getTotal(){
        return donateListMapper.selectTotal();
    }


//    기부 리스트 전체 게시글 조회
    public List<DonateListVo> showList(String status){
        return donateListMapper.selectList(status);
    };



}
