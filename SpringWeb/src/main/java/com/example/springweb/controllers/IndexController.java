package com.example.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
//@ResponseBody
public class IndexController {
    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        return "index";
    }
}
