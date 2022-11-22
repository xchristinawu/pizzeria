package dev.christinawu.models.pizzas;

import dev.christinawu.models.toppings.*;

import java.math.BigDecimal;
import java.util.Arrays;

public abstract class VeggieSpecial extends Pizza {

    public VeggieSpecial(String name, String size, BigDecimal basePrice) {
        super(name, size, basePrice,
                Arrays.asList(new Mushroom(), new GreenBellPepper(), new RomaTomato(), new RedOnion(), new BlackOlive()));
    }

    @Override
    public BigDecimal getTotalPizzaPrice() {
        BigDecimal toppingPrice = new BigDecimal("0");

        for (Topping t : super.getToppings()) {
            if (!t.getName().equals("Mushroom") && !t.getName().equals("Green Bell Pepper") && !t.getName().equals("Roma Tomato") &&
                    !t.getName().equals("Red Onion") && !t.getName().equals("Black Olive")) {
                toppingPrice = toppingPrice.add(t.getPrice());
            }
        }

        return super.getBasePrice().add(toppingPrice);
    }
}
