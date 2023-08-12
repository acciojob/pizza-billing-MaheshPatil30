package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(double basePrice) {
        super(basePrice);
        addExtraCheese();
        addExtraToppings();
    }
}

