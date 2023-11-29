package com.choi.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String redirectHome(){
        return "redirect:/home";
    }
}
