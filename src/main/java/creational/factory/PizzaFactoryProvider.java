package creational.factory;

import creational.factory.factories.ChicagoPizzaFactory;
import creational.factory.factories.NYPizzaFactory;
import creational.factory.factories.PizzaFactory;

public class PizzaFactoryProvider {

    PizzaFactory getFactory(String factoryType){
        PizzaFactory factory = null;

        if (factoryType.equalsIgnoreCase("New York")){
            factory = new NYPizzaFactory();
        } else if (factoryType.equalsIgnoreCase("Chicago")){
            factory = new ChicagoPizzaFactory();
        }

        return factory;
    }
}
