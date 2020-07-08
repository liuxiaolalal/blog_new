package com.site.blog.my.core.controller.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping("/test")
    public String hello(HttpServletRequest request, @RequestParam(value = "description", required = false, defaultValue = "test-des") String description) {
        request.setAttribute("description", description);
        return "test";
    }

}