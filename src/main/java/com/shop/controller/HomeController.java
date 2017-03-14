package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EgorPC on 12.03.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String toHome() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String homePage() {
        return "index";
    }
}
