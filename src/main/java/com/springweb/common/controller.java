package com.springweb.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/")
    public String showpage(){
        return "index";
    }
}
