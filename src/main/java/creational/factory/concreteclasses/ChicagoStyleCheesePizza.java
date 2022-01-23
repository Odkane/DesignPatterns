package creational.factory.concreteclasses;

import creational.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void start() {
        System.out.println("Starting to make a Cheese Pizza Chicago Style....");
    }

    @Override
    public void delivery() {
        System.out.println("Cheese Pizza Chicago Style is in delivery....");
    }
}
