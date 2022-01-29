package creational.factory.factories;

import creational.factory.products.Pizza;
import creational.factory.PizzaType;
import creational.factory.products.NYStyleCheesePizza;
import creational.factory.products.NYStyleVeggiePizza;
import creational.factory.products.NYStylePepperoniPizza;

public class NYPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType type){
        switch(type) {
            case PEPPERONI:
                return new NYStylePepperoniPizza("NY Style Pepperoni Pizza");
            case CHEESE:
                return new NYStyleCheesePizza("NY Style Cheese Pizza");
            case VEGGIE:
                return new NYStyleVeggiePizza("NY Style Veggie Pizza");
            default :
                throw new IllegalArgumentException("Type unknown");
        }
    }
}
