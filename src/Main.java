import BasePizza.BasePizza;
import BasePizza.Margherita;
import Toppings.ExtraCheese;
import Toppings.ExtraOnion;
import Toppings.ExtraToppings;

public class Main {
    public static void main(String[] args) {

        BasePizza margherita = new Margherita();
        ExtraToppings extraToppings = new ExtraCheese(margherita);

        System.out.println("Margherita Pizza with Cheese cost is " + extraToppings.cost());
        ExtraToppings extraOnion = new ExtraOnion(extraToppings);
        System.out.println("Margherita Pizza with Onion cost is " + extraOnion.cost());
    }
}