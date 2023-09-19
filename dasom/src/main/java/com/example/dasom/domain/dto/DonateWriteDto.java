package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class DonateWriteDto {
    Long donatewriteNumber;
    Long adminNumber;
    String donatewriteTitle;
    Long donatewriteStatus;
    Date donatewriteDate;
}
