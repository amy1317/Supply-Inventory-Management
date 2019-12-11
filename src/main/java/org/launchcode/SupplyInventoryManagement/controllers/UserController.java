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
    public String login(Model model, @ModelAttribute @Valid User newUser,
                        Errors errors, String verify, HttpServletRequest request) {

       /* model.addAttribute(user);
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

        return "login";*/
        if (errors.hasErrors()) {
           model.addAttribute("title", "Inventory Management");
            return "login";
        }

        //if valid user return to main page with welcome message
        User userEntity = userDao.findByEmail(newUser.getEmail());
        model.addAttribute("title", "Inventory Management");
        if (userEntity != null && userEntity.getEmail().equalsIgnoreCase(newUser.getEmail())) {
            //   might not need this   request.getSession().invalidate();
//            request.getSession().setAttribute("email",userEntity.getEmail());
//              look for more code
            return "home";
        }

// if invalid user or wrong password redirect him to login page with invalid credentials prompt
        model.addAttribute("login", "Invalid Credentials ");
        newUser.setPassword("");
        return "login";
    }


    @RequestMapping(value = "register", method = RequestMethod.GET)
    private String register(Model model) {

        model.addAttribute(new User());
        model.addAttribute("title", "Inventory Management");

        return "register";
    }


    // Process form input data
    @RequestMapping(value = "register", method = RequestMethod.POST)
    private String register(Model model, User newUser, Errors errors, String verify) {

        model.addAttribute(newUser);
        /*boolean passwordsMatch = true;
        if (newUser.getPassword() == null || verify == null
                || !newUser.getPassword().equals(verify)) {
            passwordsMatch = false;
            newUser.setPassword("");
            model.addAttribute("verifyError", "Passwords must match");
        }

        if (!errors.hasErrors() && passwordsMatch) {
            model.addAttribute("title", "Register");
            return "login";*/


        if (errors.hasErrors()) {
            model.addAttribute("title", "Register");
            return "redirect:/register";
        }

        userDao.save(newUser);
        return "login";

    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("title", "Inventory Management");

        return "home";
    }

    /*@RequestMapping(value = "home", method = RequestMethod.POST)
    public String home(Model model) {

        model.addAttribute("title", "Inventory Management");
    }*/
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login";
    }
}









