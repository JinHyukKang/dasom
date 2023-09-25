package com.example.dasom.service;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.domain.vo.UserVo;
import com.example.dasom.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyPageService {
    private final UserMapper userMapper;

    public List<UserVo> donateUserSelectAll(Long userNumber) {
        List<UserVo> donateUserSelectAll = userMapper.donateUserSelectAll(userNumber);
        return donateUserSelectAll;
    }

    public List<UserVo> csUserSelectAll(Long userNumber) {
        List<UserVo> csUserSelectAll = userMapper.csUserSelectAll(userNumber);
        return csUserSelectAll;
    }

    public UserDto userSelect(Long userNumber) {
        UserDto userSelect = userMapper.userSelect(userNumber);
        return userSelect;
    }

    public void userUpdate( Long userNumber, String userEmail, String userPhone, String userPostCode, String userAddr, String userAddExtra, String userAddDetail) {
        userMapper.userUpdate(userNumber, userEmail, userPhone, userPostCode, userAddr, userAddExtra, userAddDetail);
    }
}
