package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Component
@Data
@NoArgsConstructor
@Validated
public class UserDto {
    Long userNumber;
    @NotBlank(message = "아이디를 입력해주세요.")
    @Size(min = 3, max = 10, message = "아이디는 3자 이상 10자 이하로 입력해주세요.")
    String userId;
    @NotBlank
    @Size(min = 8, max = 20, message = "비밀번호는 8자 이상 20자 이하로 입력해주세요.")
    String userPassword;
    String userName;
    String userBirthYear;
    String userBirthMonth;
    String userBirthDay;
    @NotBlank(message = "휴대폰 번호를 입력해주세요.")
    @Pattern(regexp = "(01[016789])(\\d{3,4})(\\d{4})", message = "올바른 휴대폰 번호를 입력해주세요.")
    String userPhone;
    @NotBlank(message = "이메일 주소를 입력해주세요.")
    @Email(message = "올바른 이메일 주소를 입력해주세요.")
    String userEmail;
    String userGender;
    String userPostCode;
    String userAddr;
    String userAddExtra;
    String userAddDetail;
    String userJoinDate;

}
