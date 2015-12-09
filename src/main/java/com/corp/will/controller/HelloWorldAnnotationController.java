package com.corp.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by will.wang on 2015/12/10.
 */
@Controller
public class HelloWorldAnnotationController {

    @RequestMapping("/springMVC/helloWorldAnnotation")
    public ModelAndView helloWorldAnnotation() {
        ModelAndView modelAndView = new ModelAndView("helloWorldAnnotation");
        modelAndView.addObject("msg", "helloWorldAnnotation");
        return modelAndView;
    }

    /**
     * 在映射到具体的RequestMapping之前执行此方法
     * URL参数中要有abc
     */
    @ModelAttribute
    public void addAttribute(@RequestParam String abc, Model model) {
        model.addAttribute("addAttributeName", abc);
    }
}
