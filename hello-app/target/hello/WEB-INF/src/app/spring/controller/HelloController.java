package app.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        System.out.println("-->> redirect to home ");
        return mav;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView loginProcess() {
        ModelAndView mav = new ModelAndView("hello");
        System.out.println("-->> redirect to hello ");
        return mav;
    }
}