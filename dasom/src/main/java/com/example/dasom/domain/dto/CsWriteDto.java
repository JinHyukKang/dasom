package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class CsWriteDto {
    private Long cswriteNumber;
    private Long adminNumber;
    private String cswriteTitle;
    private Date cswriteRecruitStart;
    private Date cswriteRecruitEnd;
    private String cswriteCount;
    private String cswritePlace;
    private Date cswriteActStart;
    private Date cswriteActEnd;
    private Long cswriteStatus;
    private Date cswriteDate;
    private String cswriteManager;
    private String cswritePhone;
}
