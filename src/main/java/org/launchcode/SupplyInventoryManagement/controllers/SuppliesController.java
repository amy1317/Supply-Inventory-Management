package org.launchcode.SupplyInventoryManagement.controllers;



import org.launchcode.SupplyInventoryManagement.models.Supplies;
import org.launchcode.SupplyInventoryManagement.models.User;
import org.launchcode.SupplyInventoryManagement.models.data.SuppliesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class SuppliesController {

    @Autowired
    private SuppliesDao suppliesDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    private String add(Model model) {

        model.addAttribute(new Supplies());
        model.addAttribute("title", "Inventory Management");

        return "add";
    }


    // Process form input data
    @RequestMapping(value = "add", method = RequestMethod.POST)
    private String register(Model model, Supplies newSupplies, Errors errors) {

        model.addAttribute(newSupplies);

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Supplies");
            return "list/stock";

        }
        suppliesDao.save(newSupplies);
        return "list/stock";



    }

}


    /*make sure you do a mapping in controllers to that folder name*/
    /*add the annotation @Controller and add the corresponding class to your project.
    Add Request Mapping code to the body of your YourProjectController class*/


