package dev.christinawu.models.pizzas;

import dev.christinawu.models.toppings.*;

import java.math.BigDecimal;
import java.util.Arrays;

public abstract class HawaiianSpecial extends Pizza {

    public HawaiianSpecial(String name, String size, BigDecimal basePrice) {
        super(name, size, basePrice,
                Arrays.asList(new Pineapple(), new Ham(), new Chicken(), new GreenBellPepper()));
    }

    @Override
    public BigDecimal getTotalPizzaPrice() {
        BigDecimal toppingPrice = new BigDecimal("0");

        for (Topping t : super.getToppings()) {
            if (!t.getName().equals("Pineapple") && !t.getName().equals("Ham") && !t.getName().equals("Chicken") &&
                    !t.getName().equals("Green Bell Pepper")) {
                toppingPrice = toppingPrice.add(t.getPrice());
            }
        }

        return super.getBasePrice().add(toppingPrice);
    }
}
