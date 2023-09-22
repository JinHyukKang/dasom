package com.example.dasom.service;

import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.domain.vo.Criteria;
import com.example.dasom.domain.vo.SearchVo;
import com.example.dasom.mapper.CsWriteMapper;
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
public class CsWriteService {

    private final CsWriteMapper csWriteMapper;
    private final CsFileService csFileService;

//    봉사 글 작성
    public void register(CsWriteDto csWriteDto){
        csWriteMapper.insert(csWriteDto);
    }

//    봉사 글 작성(이미지 파일 포함)
    public void registerAndFileProc(CsWriteDto csWriteDto, MultipartFile file){
            register(csWriteDto);

            if(file.isEmpty()){return;}

            try {
                csFileService.registerAndSaveFile(file, csWriteDto.getCsWriteNumber());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    //    봉사글 전체 조회
    public List<CsWriteDto> findAll(Criteria criteria, SearchVo searchVo){

        List<CsWriteDto>list = new ArrayList<>();
        list = csWriteMapper.selectAll(criteria, searchVo);
        for(int i=0; i<list.size(); i++){
            log.info(String.valueOf(list.get(i)));
        }

        return csWriteMapper.selectAll(criteria, searchVo);
    }
    //    후원글 총 개수 조회
    public int getTotal(String keyword){
        return csWriteMapper.selectTotal(keyword);
    }

}



