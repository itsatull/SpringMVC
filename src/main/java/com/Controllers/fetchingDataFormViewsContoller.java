package com.Controllers;

import com.Daos.UserDao;
import com.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class fetchingDataFormViewsContoller {
    @ModelAttribute
    public void commonData(Model model) {
        model.addAttribute("header", "this is a heading");
    }

    @RequestMapping(path = "/form", method = RequestMethod.GET)
    public String getForm() {
        return "form";
    }

    //    @RequestMapping(path = "/processform",method = RequestMethod.POST)
//    public String processForm(HttpServletRequest request){
//        String fname = request.getParameter("first_name");
//        String lname = request.getParameter("last_name");
//
//        return "";
//    }
//  1.  using  @RequestParam
//    @RequestMapping(path = "/processform",method = RequestMethod.POST)
//    public String processForm(@RequestParam("firstName")String firstname, @RequestParam("lastName")String lastname, Model model){
////        model.addAttribute("firstname",firstname);
////        model.addAttribute("lastname",lastname);
//        User user = new User();
//        user.setFirstName(firstname);
//        user.setLastName(lastname);
//        model.addAttribute("user",user);
//        return "succes";
//    }
//    using  @ModelAttribute
//    2
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model) {
        UserDao userDao = new UserDao();
        userDao.createUser(user);
        return "succes";
        //@ModelAttribute has done three things
        //1.fetch the data from the user
        //2.map the data to User class object
        //3.also added the data to the model
    }


}
