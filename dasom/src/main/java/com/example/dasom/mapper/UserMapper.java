package com.example.dasom.mapper;

import com.example.dasom.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

//    회원가입
    public void insert(UserDto userDto);

//    로그인
    public UserDto select(@Param("userId")String userId, @Param("userPassword")String userPassword);
}
