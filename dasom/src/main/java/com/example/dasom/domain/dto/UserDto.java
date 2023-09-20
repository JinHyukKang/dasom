package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class UserDto {
    Long userNumber;
    String userId;
    String userPassword;
    String userName;
    String userBirthYear;
    String userBirthMonth;
    String userBirthDay;
    String userPhone;
    String userEmail;
    String userGender;
    String userPostCode;
    String userAddr;
    String userAddExtra;
    String userAddDetail;
    Date userJoinDate;

}
