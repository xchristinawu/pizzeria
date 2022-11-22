package dev.christinawu.models.pizzas;

import dev.christinawu.models.toppings.*;

import java.math.BigDecimal;
import java.util.Arrays;

public abstract class MeatSpecial extends Pizza {

    public MeatSpecial(String name, String size, BigDecimal basePrice) {
        super(name, size, basePrice,
                Arrays.asList(new Pepperoni(), new ItalianSausage(), new Ham(), new Bacon(), new Beef()));
    }

    @Override
    public BigDecimal getTotalPizzaPrice() {
        BigDecimal toppingPrice = new BigDecimal("0");

        for (Topping t : super.getToppings()) {
            if (!t.getName().equals("Pepperoni") && !t.getName().equals("Italian Sausage") && !t.getName().equals("Ham") &&
                    !t.getName().equals("Bacon") && !t.getName().equals("Beef")) {
                toppingPrice = toppingPrice.add(t.getPrice());
            }
        }

        return super.getBasePrice().add(toppingPrice);
    }
}
