package com.kasuni.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute; 

import com.kasuni.school.entity.User;
import com.kasuni.school.service.UserService;

import org.springframework.web.bind.annotation.PostMapping; 

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String createUserForm(Model model) {
        //create user object to build user form
        User user = new User();
        model.addAttribute("user", user);
        return "registration_form" ;
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute("user") User user ) {
        userService.saveUser(user);
        return "redirect:/login";
    }  
    
}
