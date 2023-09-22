package com.example.dasom.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
//@NoArgsConstructor
public class SearchVo {
    String cate;
    String keyword;

    public SearchVo() {
        this.cate = "";
        this.keyword = "";
    }

}
