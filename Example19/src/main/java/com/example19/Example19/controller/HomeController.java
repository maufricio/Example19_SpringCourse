package com.example19.Example19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "/home"})
    public String homeRedirection(Model model) {
        model.addAttribute("username", "Mauricio Perez"); //Sends this value to views
        return "home.html"; //Home view returning...
    }
}
