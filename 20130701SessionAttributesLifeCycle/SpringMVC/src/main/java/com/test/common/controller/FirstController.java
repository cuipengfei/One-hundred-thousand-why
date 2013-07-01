package com.test.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class FirstController {
    @RequestMapping(value = "firstpage", method = GET)
    public String myHander(HttpSession httpSession) {
        if (httpSession.getAttribute("someClass") == null) {
            httpSession.setAttribute("someClass", new SomeClass());
        }
        return "firstpage";
    }
}