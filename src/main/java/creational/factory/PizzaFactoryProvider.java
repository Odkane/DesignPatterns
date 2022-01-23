package creational.factory;

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
