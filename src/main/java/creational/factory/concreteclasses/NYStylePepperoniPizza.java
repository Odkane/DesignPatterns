package creational.factory.concreteclasses;

import creational.factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    @Override
    public void start() {
        System.out.println("Starting to make a Pepperoni Pizza NY Style....");
    }
    @Override
    public void delivery() {
        System.out.println("Pepperoni Pizza NY Style is in delivery....");
    }
}
