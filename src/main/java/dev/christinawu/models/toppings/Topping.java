package dev.christinawu.models.toppings;


import java.math.BigDecimal;

public abstract class Topping {

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
    public Topping(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

}
