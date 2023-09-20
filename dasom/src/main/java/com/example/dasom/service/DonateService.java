package com.example.dasom.service;

import com.example.dasom.domain.vo.DonateWriteVo;
import com.example.dasom.mapper.DonateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonateService {
    private final DonateMapper donateMapper;

//    기부 페이지 전체 게시글 수 조회
    public int getTotal(){
        return donateMapper.selectTotal();
    }


//    기부 리스트 전체 게시글 조회
    public List<DonateWriteVo> showList(String status){
        return donateMapper.selectList(status);
    };



}
