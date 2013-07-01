package com.mkyong.common.controller;

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
        someClass.setNumber(456);
        someClass.setStr("456");
        return "secondpage";
    }
}
