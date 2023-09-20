package com.example.dasom.mapper;

import com.example.dasom.domain.vo.DonateWriteVo;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Transactional
class DonateMapperTest {

    @Autowired
    DonateMapper donateMapper;

    DonateWriteVo donateWriteVo;

    @Test
    void selectList() {
        List<DonateWriteVo> donateWriteVo =  donateMapper.selectList("1");
        assertThat(donateWriteVo.size()).isEqualTo(11);
    }
}