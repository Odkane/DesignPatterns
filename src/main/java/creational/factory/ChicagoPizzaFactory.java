package creational.factory;

import creational.factory.concreteclasses.ChicagoStyleCheesePizza;
import creational.factory.concreteclasses.ChicagoStyleVeggiePizza;
import creational.factory.concreteclasses.ChicagoSytlePepperoniPizza;

public class ChicagoPizzaFactory extends PizzaFactory{

    @Override
    public Pizza createPizza(PizzaType type){
        switch(type) {
            case PEPPERONI:
                return new ChicagoSytlePepperoniPizza();
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            default :
                throw new IllegalArgumentException("Type unknown");
        }
    }
}
