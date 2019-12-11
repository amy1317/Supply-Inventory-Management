package org.launchcode.SupplyInventoryManagement.controllers;



import org.launchcode.SupplyInventoryManagement.models.Supplies;
import org.launchcode.SupplyInventoryManagement.models.User;
import org.launchcode.SupplyInventoryManagement.models.data.SuppliesDao;
import org.launchcode.SupplyInventoryManagement.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class SuppliesController {

    @Autowired
    private SuppliesDao suppliesDao;

    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "/list/stock", method = RequestMethod.GET)
    private String stock(Model model) {

        model.addAttribute("supplies", new Supplies());
        model.addAttribute("title", "Inventory Management");
        model.addAttribute("supplies", suppliesDao.findAll());

        return "list/stock";
    }


    @RequestMapping(value = "add", method = RequestMethod.GET)
    private String add(Model model) {

        model.addAttribute("supplies", new Supplies());
        model.addAttribute("title", "Inventory Management");
        model.addAttribute("supplies", suppliesDao.findAll());

        return "add";
    }


    // Process form input data

    @RequestMapping(value = "add", method = RequestMethod.POST)
    private String add(Model model, @ModelAttribute @Valid Supplies supplies, Errors errors) {

        model.addAttribute(supplies);
        if (errors.hasErrors()) {
            model.addAttribute("title", "Inventory Management");
            return "redirect:/add";
        }

            suppliesDao.save(supplies);
            return "list/stock";


        }


    @RequestMapping(value = "/list/stockview", method = RequestMethod.GET)
    private String stockview(Model model) {

        model.addAttribute("supplies", new Supplies());
        model.addAttribute("title", "Inventory Management");
        model.addAttribute("supplies", suppliesDao.findAll());

        return "list/stockview";
    }

    @RequestMapping(value = "/list/stockview", method = RequestMethod.POST)
    private String stockview(@ModelAttribute @Valid Supplies newSupplies,
                            Errors errors, @RequestParam int categoryID, Model model) {


         model.addAttribute("title", "Inventory Management");
          return "redirect:";
        }



    }




