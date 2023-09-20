package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class DonateFileDto {
    private Long donatefileNumber;
    private Long donatewriteNumber;
    private String donatefileName;
    private String donatefileUploadPath;
    private String donatefileUuid;
}
