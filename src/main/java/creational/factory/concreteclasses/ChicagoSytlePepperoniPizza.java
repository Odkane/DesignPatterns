package creational.factory.concreteclasses;

import creational.factory.Pizza;

public class ChicagoSytlePepperoniPizza extends Pizza {

    @Override
    public void start() {
        System.out.println("Starting to make a Pepperoni Pizza Chicago Style....");
    }

    @Override
    public void delivery() {
        System.out.println("Pepperoni Pizza Chicago Style is in delivery....");
    }
}
