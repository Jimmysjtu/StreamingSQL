package com.project.streamsql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/response")
    @ResponseBody
    public String test() {
        System.out.println("success !!!");
        return "hi!";
    }


}
