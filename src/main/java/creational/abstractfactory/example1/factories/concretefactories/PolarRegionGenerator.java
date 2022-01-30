package creational.abstractfactory.example1.factories.concretefactories;

import creational.abstractfactory.example1.factories.AbstractFactory;
import creational.abstractfactory.example1.products.Animal;
import creational.abstractfactory.example1.products.concreteproducts.polar.Moss;
import creational.abstractfactory.example1.products.concreteproducts.polar.PolarBear;
import creational.abstractfactory.example1.products.concreteproducts.polar.Snow;
import creational.abstractfactory.example1.products.Ground;
import creational.abstractfactory.example1.products.Plant;

public class PolarRegionGenerator implements AbstractFactory {

    @Override
    public Animal createAnimal() {
        return new PolarBear();
    }

    @Override
    public Plant createPlant() {
        return new Moss();
    }
    
    @Override
    public Ground createGround() {
        return new Snow();
    }
}
