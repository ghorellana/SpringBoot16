package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
    @RequestMapping("/")
    public String index(){
        return "index";

    }

    @RequestMapping("/2")
    public String page2(){
        return "index";

    }


    @RequestMapping("/3")
    public String page3(){
        return "index";

    }
}
