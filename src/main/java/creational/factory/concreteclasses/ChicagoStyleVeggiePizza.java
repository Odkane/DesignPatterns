package creational.factory.concreteclasses;

import creational.factory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    @Override
    public void start() {
        System.out.println("Starting to make a Veggie Pizza Chicago Style....");
    }

    @Override
    public void delivery() {
        System.out.println("Veggie Pizza Chicago Style is in delivery....");
    }
}
