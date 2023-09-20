package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class CsFileDto {
    private Long csfileNumber;
    private Long cswriteNumber;
    private String csfileName;
    private String csfileUploadPath;
    private String csfileUuid;
}
