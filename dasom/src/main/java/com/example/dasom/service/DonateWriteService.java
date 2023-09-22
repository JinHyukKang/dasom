package com.example.dasom.service;

import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.domain.vo.Criteria;
import com.example.dasom.domain.vo.SearchVo;
import com.example.dasom.mapper.DonateWriteMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DonateWriteService {

    private final DonateWriteMapper donateWriteMapper;
    private final DonateFileService donateFileService;

//    후원 글 작성
    public void register(DonateWriteDto donateWriteDto){
        donateWriteMapper.insert(donateWriteDto);
    }

//    후원 글 작성(이미지 파일 포함)
    public void registerAndFileProc(DonateWriteDto donateWriteDto, MultipartFile file){
        register(donateWriteDto);

        if(file.isEmpty()){return;}

        try {
            donateFileService.registerAndSaveFile(file, donateWriteDto.getDonateWriteNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    후원글 전체 조회
    public List<DonateWriteDto> findAll(Criteria criteria, SearchVo searchVo){

        List<DonateWriteDto>list = new ArrayList<>();
        list = donateWriteMapper.selectAll(criteria, searchVo);
        for(int i=0; i<list.size(); i++){
            log.info(String.valueOf(list.get(i)));
        }

        return donateWriteMapper.selectAll(criteria, searchVo);
    }
//    후원글 총 개수 조회
    public int getTotal(String keyword){
    return donateWriteMapper.selectTotal(keyword);
}
}
