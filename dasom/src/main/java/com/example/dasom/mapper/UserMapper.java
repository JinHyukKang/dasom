package com.example.dasom.mapper;

import com.example.dasom.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;






@Mapper
public interface UserMapper {

        public UserDto findUserId(@Param("userName") String userName, @Param("userPhone") String userPhone, @Param("userBirthYear")String userBirthYear ,@Param("userBirthMonth")String userBirthMonth,@Param("userBirthDay") String userBirthDay);
        public UserDto findUserPassword(@Param("userId") String userId,@Param("userName") String userName, @Param("userPhone") String userPhone);

//    회원가입
    public void insert(UserDto userDto);

//    로그인
    public UserDto select(@Param("userId")String userId, @Param("userPassword")String userPassword);

}
