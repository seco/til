package com.shopping.shoppingmall.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/shop")
public class MemberController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/info")
    public String info(Principal principal) {
        System.out.println(principal.getName());

        UserDetails loginUser =
                (UserDetails) SecurityContextHolder
                .getContext().getAuthentication().getPrincipal();

        System.out.println(loginUser.getUsername());

        return "info";
    }
}
