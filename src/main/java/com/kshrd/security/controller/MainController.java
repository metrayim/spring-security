package com.kshrd.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class MainController {

    @GetMapping("/user")
    public String userForom(){
        return "user/user";
    }

    @GetMapping("/dba")
    public String dbaForom(){
        return "dba/dba";
    }
    @GetMapping("/admin")
    public String adminForom(){
        return "admin/admin";
    }
}
