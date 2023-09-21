package com.example.dasom.service;

import com.example.dasom.domain.dto.CsDto;
import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.domain.vo.DonateListVo;
import com.example.dasom.mapper.CsListMapper;
import com.example.dasom.mapper.DonateListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CsListService {
    private final CsListMapper csListMapper;

//    봉사 페이지 전체 게시글 수 조회
//    public int getTotal(){
//        return donateListMapper.selectTotal();
//    }


//    봉사 리스트 전체 게시글 조회
    public List<CsWriteDto> showList(String status){

        return csListMapper.selectList(status);
    };



}
