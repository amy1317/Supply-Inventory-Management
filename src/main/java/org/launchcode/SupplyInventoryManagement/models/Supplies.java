package org.launchcode.SupplyInventoryManagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplies {

    @Id
    @GeneratedValue
    private int id;
}
