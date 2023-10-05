package com.example.dasom.controller;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.service.FindService;
import com.example.dasom.service.MyPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/find/*")
@RequiredArgsConstructor
public class FindController {
    private final FindService findService;
    private final MyPageService myPageService;

    @GetMapping("/findId")
    public String findId() {
        return "/user/find/findId";
    }

    @PostMapping("/findIdOk")
    public String findId(
            String userName, String userPhone,
            String userBirthYear, String userBirthMonth, String userBirthDay,
            Model model
    ) {

        UserDto userDto = findService.findId(userName, userPhone, userBirthYear, userBirthMonth, userBirthDay);

        model.addAttribute("userDto", userDto);
        if (userDto != null) {
            model.addAttribute("userId", userDto.getUserId());
        } else {
            model.addAttribute("userId", " ");
        }
        return "/user/find/findId";
    }

    @GetMapping("/findPassword")
    public String findPassword() {
        return "/user/find/findPw";
    }

    @PostMapping("/findPassword")
    public String findPassword(
            String userName, String userPhone,
            String userId,
            Long userNumber,UserDto userDto,Model model
    ) {
        userNumber = findService.findUserNumber(userName, userId, userPhone);
        userDto.setUserNumber(userNumber);
        model.addAttribute("User", userNumber);
        return "/user/find/findPw1";
    }
}

