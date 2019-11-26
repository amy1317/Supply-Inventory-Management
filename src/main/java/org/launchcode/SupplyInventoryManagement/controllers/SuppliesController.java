package org.launchcode.SupplyInventoryManagement.controllers;

import org.launchcode.SupplyInventoryManagement.models.data.SuppliesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class SuppliesController {

    @Autowired
    private SuppliesDao suppliesDao;

    /*make sure you do a mapping in controllers to that folder name*/
    /*add the annotation @Controller and add the corresponding class to your project.
    Add Request Mapping code to the body of your YourProjectController class
     */
}
