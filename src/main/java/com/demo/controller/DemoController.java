package com.demo.controller;

import com.demo.service.Demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sdyang on 2016/6/13.
 */
@Controller
public class DemoController {

    @Resource
    private Demo demoTest;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String sayHello(HttpServletRequest request,HttpServletResponse response,Model model){
        return demoTest.sayHello("sdyang");
    }
}
