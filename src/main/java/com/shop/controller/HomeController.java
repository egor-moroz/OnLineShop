package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by EgorPC on 12.03.2017.
 */
@Controller
@RequestMapping({"/", "/home"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String toHome() {
        return  "home";
    }

}
