package dev.christinawu;

import dev.christinawu.models.drinks.FreshWater;
import dev.christinawu.models.pizzas.BulbasaurSpecial;
import dev.christinawu.models.toppings.*;

public class Main {
    public static void main(String[] args) {
        BulbasaurSpecial bulbasaurSpecial = new BulbasaurSpecial();
        FreshWater freshWater = new FreshWater();
        bulbasaurSpecial.addTopping(new Pepperoni());
        bulbasaurSpecial.addTopping(new Mushroom());
        bulbasaurSpecial.addTopping(new Mushroom());
        System.out.println(bulbasaurSpecial.getTotalPizzaPrice());


    }
}