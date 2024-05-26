package com.kasuni.school.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kasuni.school.entity.Login;
import com.kasuni.school.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class LoginController {

    @Autowired
    private LoginService userservice;

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user ) {
        Login oathUser = userservice.login(user.getUsername(), user.getPassword());

        System.out.print(oathUser);
        if(Objects.nonNull(oathUser)) {
            return "redirect:/students";
        }
        else 
        {
            return "redirect:/login";
        }
    }
    
    
    
}
