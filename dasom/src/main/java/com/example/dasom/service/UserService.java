package com.example.dasom.service;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

//    회원가입
    public void register(UserDto userDto){
        if(userDto == null){
            throw new IllegalArgumentException("회원 정보가 누락됨!!!");
        }

        userMapper.insert(userDto);
    }

//    로그인
    public UserDto find(String userId, String userPassword){
        return Optional.ofNullable(userMapper.select(userId, userPassword))
                .orElseThrow( () -> {throw new IllegalArgumentException("조회 결과 없음"); });
    }


//    @Transactional(readOnly = true)
//    public Map<String, String> validateHandling(Errors errors){
//        Map<String, String> validatorResult = new HashMap<>();
//
//        for(FieldError error : errors.getFieldErrors()){
//            String validKeyName = String.format("valid_%s", error.getField());
//            validatorResult.put(validKeyName, error.getDefaultMessage());
//        }
//        return validatorResult;
//    }

}
