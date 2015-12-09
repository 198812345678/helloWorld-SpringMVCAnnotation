package com.corp.will.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

/**
 * Created by will.wang on 2015/12/9.
 */
@Controller
public class AddAttributeController {



    @ModelAttribute
    public void addAttribute(@RequestParam String abc, Model model) {
        model.addAttribute("addAttributeName", abc);
    }
}
