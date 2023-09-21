package com.example.dasom.mapper;

import com.example.dasom.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    public UserDto findUserId(UserDto userDto);

}
