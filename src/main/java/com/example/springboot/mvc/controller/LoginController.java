package com.example.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @RequestMapping(value="/login")
    //@ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        model.addAttribute("username",username);
        return "/OK";
    }

    @GetMapping(value="/show")
    public String show(){
        return "/OK";
    }
}
