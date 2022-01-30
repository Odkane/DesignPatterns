package creational.abstractfactory.example1.factories;

import creational.abstractfactory.example1.products.Animal;
import creational.abstractfactory.example1.products.Ground;
import creational.abstractfactory.example1.products.Plant;

public interface AbstractFactory {

    Animal createAnimal();
    Plant createPlant();
    Ground createGround();

}
