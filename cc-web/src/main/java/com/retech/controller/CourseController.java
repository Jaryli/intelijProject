package com.retech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jary on 2016/10/25.
 */
@Controller
public class CourseController {
    @RequestMapping("Hello")
    public String Req() {
        System.out.println("my name");
        return "result";
    }
}
