package org.launchcode.SupplyInventoryManagement.controllers;

import org.launchcode.SupplyInventoryManagement.models.User;
import org.launchcode.SupplyInventoryManagement.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model) {

        model.addAttribute(new User());
        model.addAttribute("title", "Inventory Management");

        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(Model model, @ModelAttribute @Valid User user,
                        Errors errors, String verify) {

        model.addAttribute(user);
        boolean passwordsMatch = true;
        if (user.getPassword() == null || verify == null
                || !user.getPassword().equals(verify)) {
            passwordsMatch = false;
            user.setPassword("");
            model.addAttribute("verifyError", "Passwords must match");
        }

        if (!errors.hasErrors() && passwordsMatch) {
            return "home";
        }

        return "login";
    }
}



  /*  @RequestMapping(value="register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute(new User());
        model.addAttribute("title", "Inventory Management");

        return "register";
    }


    // Process form input data
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(Model model,User user, Errors errors) {


    return "login";


}*/






