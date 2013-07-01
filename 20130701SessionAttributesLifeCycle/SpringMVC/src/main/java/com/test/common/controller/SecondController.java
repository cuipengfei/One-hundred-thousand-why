package com.test.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@SessionAttributes(types = SomeClass.class)
public class SecondController {

    @RequestMapping(value = "secondpage", method = GET)
    public String myHandler(SomeClass someClass, HttpSession httpSession) {
        //asking spring for the SomeClass parameter, that's why we put it in the annotation.
        System.out.print(someClass.hashCode());

        httpSession.invalidate();

        return "secondpage";
    }
}
