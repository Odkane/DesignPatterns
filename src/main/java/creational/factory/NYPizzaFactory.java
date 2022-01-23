package creational.factory;

import creational.factory.concreteclasses.NYStyleCheesePizza;
import creational.factory.concreteclasses.NYStyleVeggiePizza;
import creational.factory.concreteclasses.NYStylePepperoniPizza;

public class NYPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(PizzaType type){
        switch(type) {
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            case CHEESE:
                return new NYStyleCheesePizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            default :
                throw new IllegalArgumentException("Type unknown");
        }
    }
}
