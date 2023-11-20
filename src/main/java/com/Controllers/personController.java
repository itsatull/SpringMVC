package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/person", method = RequestMethod.GET)
public class personController {

    @RequestMapping(value = "/age", method = RequestMethod.GET)
    public String age(Model m) {
        m.addAttribute("age", "25");
        return "person";
    }


}
