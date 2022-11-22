package dev.christinawu.models.drinks;

import java.math.BigDecimal;

public abstract class Drink {

    // private variables
    private String name;
    private BigDecimal price;

    // public properties
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    // constructor
    public Drink(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

}
