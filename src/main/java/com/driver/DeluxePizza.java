package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // to make deluxe pizza we have to add both extra cheese and toppings by default
        addExtraCheese();
        addExtraToppings();
    }
}
