package com.example.demo.controler;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public void signUp(@RequestBody UserRequestDto userRequestDto) {
        userService.signUp(userRequestDto);
    }

    @GetMapping("/user/{user-id}")
    @ResponseBody
    public UserResponseDto getUser(@PathVariable("user-id") Long id) {
        return userService.getUser(id);
    }

}
