package com.example.dasom.service;

import com.example.dasom.domain.vo.AdDonateVo;
import com.example.dasom.domain.vo.Criteria;
import com.example.dasom.domain.vo.SearchVo;
import com.example.dasom.mapper.AdDonateMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AdDonateService {

    private final AdDonateMapper adDonateMapper;

//    후원 내역 전체 조회
    public List<AdDonateVo> findAll(Criteria criteria, SearchVo searchVo){

        List<AdDonateVo> list = new ArrayList<>();
        log.info(searchVo.toString());
        list = adDonateMapper.selectAll(criteria,searchVo);
        for (int i=0; i<list.size(); i++){
            log.info(String.valueOf(list.get(i)));
        }

        return adDonateMapper.selectAll(criteria,searchVo);
    }
    //    후원 내역 갯수 조회
    public int getTotal(SearchVo searchVo){
        return adDonateMapper.selectTotal(searchVo);
    }
}
