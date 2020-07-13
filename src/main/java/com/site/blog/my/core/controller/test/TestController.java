package com.site.blog.my.core.controller.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    @GetMapping("/test")
    public String hello(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "description", required = false, defaultValue = "test-des") String description) {
        request.setAttribute("description", description);
        response.addHeader("x-frame-options","allow-from http://tongji.baidu.com/");
        return "test";
    }

}