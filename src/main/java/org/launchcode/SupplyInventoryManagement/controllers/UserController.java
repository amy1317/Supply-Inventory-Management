package org.launchcode.SupplyInventoryManagement.controllers;

import org.launchcode.SupplyInventoryManagement.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserDao userDao;

    /* TODO @RequestMapping */

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) {
        /* I need to put "name" in the parenthesis below */
        String name = request.getParameter("name");
        if (name == null) {
            name = "World!";
        }
        return "Hello " + name;
    }

}

/*make sure you do a mapping in controllers to that folder name*/
 /*add the annotation @Controller and add the corresponding class to your project.
    Add Request Mapping code to the body of your YourProjectController class
     */




