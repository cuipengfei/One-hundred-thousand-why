package com.mkyong.common.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class HelloWorldController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("123");
        list1.add("789");

        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("msg", "hello world");
        model.addObject("list1", list1);

        return model;
    }

}