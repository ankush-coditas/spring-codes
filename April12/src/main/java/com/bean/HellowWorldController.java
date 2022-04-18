package com.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowWorldController {
    @RequestMapping("/hello.html")
    public ModelAndView helloworld(){
        String msg="Hello Spring MVC";
        return new ModelAndView("hello","message",msg);
    }
}