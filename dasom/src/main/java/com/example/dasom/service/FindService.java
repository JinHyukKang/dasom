package com.example.dasom.service;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FindService {
    private final UserMapper userMapper;

    public UserDto findId(String userName, String userPhone, String userBirthYear, String userBirthMonth, String userBirthDay) {
        return userMapper.findUserId(userName, userPhone, userBirthYear, userBirthMonth, userBirthDay);
//        return Optional.ofNullable(userMapper.findUserId(userName,userPhone,userBirthYear,userBirthMonth,userBirthDay))
//                .orElseThrow(() -> new IllegalArgumentException("조회 결과 없음"));
    }

    public UserDto findPassword(String userName, String userPhone, String userId) {
        return userMapper.findUserPassword(userName, userPhone, userId);
    }
}
