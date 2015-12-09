package com.corp.will.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by will.wang on 2015/12/7.
 */
public class HelloWorldBasicController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse httpServletResponse) throws Exception {
//        System.out.println("hello world!");
        ModelAndView modelAndView = new ModelAndView("helloWorld");
        modelAndView.addObject("message", "hello world!");
        return modelAndView;
    }

    @ModelAttribute
    public void addAttribute() {

    }
}
