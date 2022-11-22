package dev.christinawu.models.pizzas;

import dev.christinawu.models.toppings.Topping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    // private variables
    private String name;
    private String size;
    private BigDecimal basePrice;
    private List<Topping> toppings;
    private int numToppings;

    // public properties
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public int getNumToppings() {
        return numToppings;
    }

    // constructor
    public Pizza(String name, String size, BigDecimal basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
        toppings = new ArrayList<>();
        this.numToppings = 0;
    }

    public Pizza(String name, String size, BigDecimal basePrice, List<Topping> toppings) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
        this.toppings = new ArrayList<>(toppings);
        this.numToppings = toppings.size();
    }

    // methods
    public void addTopping(Topping topping) {
        boolean toppingAlreadyInList = false;

        for (Topping t : toppings) {
            if (t.getName().equals(topping.getName())) {
                toppingAlreadyInList = true;
                break;
            }
        }

        if(!toppingAlreadyInList) {
            toppings.add(topping);
            numToppings++;
        }
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public BigDecimal getTotalPizzaPrice() {
        BigDecimal toppingPrice = new BigDecimal("0");

        for (Topping t : toppings) {
            toppingPrice = toppingPrice.add(t.getPrice());
        }

        return basePrice.add(toppingPrice);
    }

}
