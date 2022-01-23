package creational.factory.concreteclasses;

import creational.factory.Pizza;

public class NYStyleCheesePizza extends Pizza {

    @Override
    public void start() {
        System.out.println("Starting to make a Cheese Pizza NY Style....");
    }

    @Override
    public void delivery() {
        System.out.println("Cheese Pizza NY Style is in delivery....");
    }
}
