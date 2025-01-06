package Toppings;

import BasePizza.BasePizza;

public class ExtraOnion extends ExtraToppings{

    BasePizza basePizza;

    public ExtraOnion(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
