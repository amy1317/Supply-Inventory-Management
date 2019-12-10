package org.launchcode.SupplyInventoryManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Email(message = "Invalid email address")
    private String email;

    @NotNull
    @Size(min = 5, max=12, message = "Password must be at least 5 characters long")
    private String password;



    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.id = id;

    }

    public User() {
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public int getId(){
        return id;
    }
}

