package com.example.dasom.mapper;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.domain.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    //    아이디찾기
    public UserDto findUserId(@Param("userName") String userName, @Param("userPhone") String userPhone, @Param("userBirthYear") String userBirthYear, @Param("userBirthMonth") String userBirthMonth, @Param("userBirthDay") String userBirthDay);

    //        비번찾기
    public UserDto findUserPassword(@Param("userId") String userId, @Param("userName") String userName, @Param("userPhone") String userPhone);

    //    회원가입
    public void insert(UserDto userDto);

    //    회원가입 아이디 중복 확인
    public int checkId(String userId) throws Exception;

    //    로그인
    public UserDto select(@Param("userId") String userId, @Param("userPassword") String userPassword);

    //    마이페이지 후원금리스트
    List<UserVo> donateUserSelectAll(@Param("userNumber") Long userNumber);

    //    마이페이지 나의 참여 리스트
    List<UserVo> csUserSelectAll(@Param("userNumber") Long userNumber);

    //    마이페이지 나의 정보
    UserDto userSelect(@Param("userNumber") Long userNumber);

    //    마이페이지 나의 정보 수정
    void userUpdate(UserDto userDto);

    //    마이페이지 나의 Pw 수정
    void userPasswordUpdate(UserDto userDto);

    //  마이페이지 회원탈퇴
    void userDelete(UserDto userDto);
//    Long userNumber;
//    String userId;
//    String userPassword;
//    String userName;
//    String userBirthYear;
//    String userBirthMonth;
//    String userBirthDay;
//    String userPhone;
//    String userEmail;
//    String userGender;
//    String userPostCode;
//    String userAddr;
//    String userAddExtra;
//    String userAddDetail;
//    String userJoinDate;
}
