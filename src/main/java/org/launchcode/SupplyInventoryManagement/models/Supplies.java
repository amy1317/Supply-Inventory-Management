package org.launchcode.SupplyInventoryManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Supplies {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String product_name;

    @NotNull
    private String category_name;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String supply_manufacturer;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String company;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String company_representative;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private Integer company_phone_number;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private Integer quantity;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private Integer cost;



    public Supplies(String product_name, String category_name, String supply_manufacturer, String company, String company_representative,
                    Integer company_phone_number, Integer quantity, Integer cost) {
        this.product_name = product_name;
        this.category_name = category_name;
        this.supply_manufacturer = supply_manufacturer;
        this.company = company;
        this.company_representative = company_representative;
        this.company_phone_number = company_phone_number;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Supplies() {
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getSupply_manufacturer() {
        return supply_manufacturer;
    }

    public void setSupply_manufacturer(String supply_manufacturer) {
        this.supply_manufacturer = supply_manufacturer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany_representative() {
        return company_representative;
    }

    public void setCompany_representative(String company_representative) {
        this.company_representative = company_representative;
    }

    public Integer getCompany_phone_number() {
        return company_phone_number;
    }

    public void setCompany_phone_number(Integer company_phone_number) {
        this.company_phone_number = company_phone_number;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}




