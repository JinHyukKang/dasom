package com.example.dasom.controller;

import com.example.dasom.domain.dto.UserDto;
import com.example.dasom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.Map;


@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserDto userDto;


    @GetMapping("/join")
    public String showJoinPage(){
        return "user/join/join";
    }

    @PostMapping("/joinPage")
    public RedirectView join(UserDto userDto){
        userService.register(userDto);
        return new RedirectView("/user/login");
    }

    @GetMapping("/login")
    public String showLoginPage(){
        return "user/login/login";
    }

    @PostMapping("/loginPage")
    public RedirectView login(String userId, String userPassword, HttpServletRequest req){
        UserDto userDto = userService.find(userId, userPassword);
        req.getSession().setAttribute("userNumber", userDto.getUserNumber());

        return new RedirectView("/mainPageLogin");
    }

//    @PostMapping("/joinProc")
//    public String joinProc(@Valid UserDto userDto, Errors errors, Model model){
//        if(errors.hasErrors()){
//            model.addAttribute("userDto", userDto);
//
//            Map<String, String> validOrResult = userService.validateHandling(errors);
//            for(String key : validOrResult.keySet()){
//                model.addAttribute(key, validOrResult.get(key));
//            }
//
//            return "user/login/join";
//        }
//        userService.register(userDto);
//        return "redirect:/user/joinProc";
//    }


}
