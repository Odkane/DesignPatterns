package creational.abstractfactory.example1.factories.concretefactories;

import creational.abstractfactory.example1.factories.AbstractFactory;
import creational.abstractfactory.example1.products.Animal;
import creational.abstractfactory.example1.products.concreteproducts.desert.Cactus;
import creational.abstractfactory.example1.products.concreteproducts.desert.Camel;
import creational.abstractfactory.example1.products.concreteproducts.desert.Sand;
import creational.abstractfactory.example1.products.Ground;
import creational.abstractfactory.example1.products.Plant;

public class DesertGenerator implements AbstractFactory {

    @Override
    public Animal createAnimal() { return new Camel(); }

    @Override
    public Plant createPlant() {
        return new Cactus();
    }

    @Override
    public Ground createGround() {
        return new Sand();
    }
}
