package com.test.common.controller;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class FirstController {
    @RequestMapping(value = "firstpage", method = GET)
    public String myHander(HttpSession httpSession) {
        DateTime now = DateTime.now();

        if (httpSession.getAttribute("someClass") == null) {
            SomeClass someClass = new SomeClass();
            someClass.setStr(now.toString());

            httpSession.setAttribute("someClass", someClass);
        }

        if (httpSession.getAttribute("someOtherClass") == null) {
            SomeOtherClass someOtherClass = new SomeOtherClass();
            someOtherClass.setStr(now.toString());

            httpSession.setAttribute("someOtherClass", someOtherClass);
        }
        return "firstpage";
    }

}