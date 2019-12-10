package org.launchcode.SupplyInventoryManagement.models;

import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


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

//    @NotNull(message = "Passwords do not match")
//    @Transient
//    private String verifyPassword;

    @OneToMany  // one user, many supplies
    @JoinColumn(name = "id")
    private List<Supplies> supplies = new ArrayList<>();

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

