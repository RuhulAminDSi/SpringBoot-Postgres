package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController {

    @RequestMapping("/custom-error")
    public ModelAndView handleError() {
        ModelAndView modelAndView = new ModelAndView("error"); // Name of the error view
        modelAndView.addObject("message", "Oops! Page Not Found"); // Add any additional data if needed
        return modelAndView;
    }
}
