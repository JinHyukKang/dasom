package com.example.dasom.service;

import com.example.dasom.domain.dto.DonateWriteDto;
import com.example.dasom.mapper.DonateWriteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
@Transactional
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
}
