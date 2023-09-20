package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
=======
import lombok.RequiredArgsConstructor;
>>>>>>> main
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class DonateWriteDto {
<<<<<<< HEAD
    Long donatewriteNumber;
    Long adminNumber;
    String donatewriteTitle;
    Long donatewriteStatus;
    Date donatewriteDate;
=======
    private Long donateWriteNumber;
    private Long adminNumber;
    private String donateWriteTitle;
    private String donateWriteStatus;
    private Date donateWriteDate;
>>>>>>> main
}
