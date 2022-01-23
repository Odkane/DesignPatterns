package creational.factory.concreteclasses;

import creational.factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    @Override
    public void start() {
        System.out.println("Starting to make a Veggie Pizza NY Style....");
    }

    @Override
    public void delivery() {
        System.out.println("Veggie Pizza NY Style is in delivery....");

    }
}
