package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class DonateWriteDto {
   private Long donatewriteNumber;
   private Long adminNumber;
   private String donatewriteTitle;
   private String donatewriteStatus;
   private Date donatewriteDate;
}
