package com.test.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@SessionAttributes(types = SomeClass.class)
//@SessionAttributes(types = SomeOtherClass.class)
//@SessionAttributes(types = {SomeClass.class, SomeOtherClass.class})
public class SecondController {

    @RequestMapping(value = "secondpage", method = GET)
    public String myHandler(SomeClass obj1, SomeOtherClass obj2, HttpSession httpSession) {
        httpSession.invalidate();

        return "secondpage";
    }
}
