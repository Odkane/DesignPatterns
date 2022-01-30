package creational.abstractfactory.example1.factories.concretefactories;

import creational.abstractfactory.example1.factories.AbstractFactory;
import creational.abstractfactory.example1.products.concreteproducts.rainforest.Elephant;
import creational.abstractfactory.example1.products.concreteproducts.rainforest.Gras;
import creational.abstractfactory.example1.products.concreteproducts.rainforest.Tree;
import creational.abstractfactory.example1.products.Animal;
import creational.abstractfactory.example1.products.Ground;
import creational.abstractfactory.example1.products.Plant;

public class RainForestGenerator implements AbstractFactory {


    @Override
    public Animal createAnimal() { return new Elephant(); }

    @Override
    public Plant createPlant() {
        return new Tree();
    }

    @Override
    public Ground createGround() {
        return new Gras();
    }
}
