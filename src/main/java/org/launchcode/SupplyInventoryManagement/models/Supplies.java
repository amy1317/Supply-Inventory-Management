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
    private String productName;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String categoryName;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String supplyManufacturer;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String company;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String companyRepresentative;

    @NotNull
    private String companyPhoneNumber;

    @NotNull
    private Integer quantity;

    @NotNull
    @Size(min = 3, message = "Product_name must be at least 3 characters long")
    private String caseQuantity;

    @NotNull
    private Integer cost;



    public Supplies(String productName, String categoryName, String supplyManufacturer, String company, String companyRepresentative,
                    String companyPhoneNumber, Integer quantity, String caseQuantity, Integer cost) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.supplyManufacturer = supplyManufacturer;
        this.company = company;
        this.companyRepresentative = companyRepresentative;
        this.companyPhoneNumber = companyPhoneNumber;
        this.quantity = quantity;
        this.caseQuantity = caseQuantity;
        this.cost = cost;
    }

    public Supplies() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSupplyManufacturer() {
        return supplyManufacturer;
    }

    public void setSupplyManufacturer(String supplyManufacturer) {
        this.supplyManufacturer = supplyManufacturer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyRepresentative() {
        return companyRepresentative;
    }

    public void setCompanyRepresentative(String companyRepresentative) {
        this.companyRepresentative = companyRepresentative;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCaseQuantity() {
        return caseQuantity;
    }

    public void setCaseQuantity(String caseQuantity) {
        this.caseQuantity = caseQuantity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}




