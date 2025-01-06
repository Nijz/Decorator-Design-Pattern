package Toppings;

import BasePizza.BasePizza;

public class ExtraCheese extends ExtraToppings{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
