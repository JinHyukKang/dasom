package com.example.dasom.service;

import com.example.dasom.domain.dto.CsWriteDto;
import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.mapper.CsWriteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
@Transactional
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
}
