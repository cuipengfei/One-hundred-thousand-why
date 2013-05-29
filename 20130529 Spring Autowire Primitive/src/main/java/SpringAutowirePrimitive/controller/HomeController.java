package SpringAutowirePrimitive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class HomeController {
    @Autowired
    private Integer tryInjectInteger;

    @Autowired
    private String tryInjectString;

    @RequestMapping(value = "/")
    public ModelAndView method1() throws IOException {
        return new ModelAndView("home");
    }

    public Integer getTryInjectInteger() {
        return tryInjectInteger;
    }

    public String getTryInjectString() {
        return tryInjectString;
    }
}
