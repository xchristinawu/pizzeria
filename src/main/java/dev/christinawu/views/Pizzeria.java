package dev.christinawu.views;

import dev.christinawu.models.pizzas.*;

import java.util.Scanner;

public class Pizzeria {

    Scanner input = new Scanner(System.in);

    public void run() {

    }

    private Pizza selectPizza() {
        String selection = input.nextLine();
        return buildPizza(selection);
    }

    private Pizza buildPizza(String name) {
        return new BulbasaurSpecial();
    }
}
