package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome() {
        return "home";
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String getDetails(Model model) {
        model.addAttribute("details", "Atul shahwal");
        return "detail";
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public ModelAndView getStatus() {
        //created model and view object
        ModelAndView modelAndView = new ModelAndView();
        //setting the data
        modelAndView.addObject("data", "gaurav");
        modelAndView.addObject("phone", "46665");
        //setting the view name
        modelAndView.setViewName("data");
        return modelAndView;
    }

    @RequestMapping(value = "/el", method = RequestMethod.GET)
    public ModelAndView el() {
        //created model and view object
        ModelAndView modelAndView = new ModelAndView();
        //setting the data
        modelAndView.addObject("data", "gaurav");
        modelAndView.addObject("phone", "46665");
        //setting the view name
        modelAndView.setViewName("experssionLanguage");
        return modelAndView;
    }
}
