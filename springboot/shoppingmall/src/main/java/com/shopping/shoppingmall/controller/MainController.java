package com.shopping.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    public MainController() {
    }

    @RequestMapping("/")
    public  String index() {
        return "index";
    }
}
