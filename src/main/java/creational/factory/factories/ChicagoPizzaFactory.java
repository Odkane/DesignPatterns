package creational.factory.factories;

import creational.factory.products.Pizza;
import creational.factory.PizzaType;
import creational.factory.products.ChicagoStyleCheesePizza;
import creational.factory.products.ChicagoStyleVeggiePizza;
import creational.factory.products.ChicagoSytlePepperoniPizza;

public class ChicagoPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(PizzaType type){
        switch(type) {
            case PEPPERONI:
                return new ChicagoSytlePepperoniPizza("Chicago Style Pepperoni Pizza");
            case CHEESE:
                return new ChicagoStyleCheesePizza("Chicago Style Cheese Pizza");
            case VEGGIE:
                return new ChicagoStyleVeggiePizza("Chicago Style Veggie Pizza");
            default :
                throw new IllegalArgumentException("Type unknown");
        }
    }
}
