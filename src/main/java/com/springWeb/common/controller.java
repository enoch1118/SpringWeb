package com.springWeb.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/")
    public String showpage(){
        return "index";
    }

    @RequestMapping("/hello")
    public String showPageHello(){
        return "hello";
    }
}
