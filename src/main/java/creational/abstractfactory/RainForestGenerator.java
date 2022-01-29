package creational.abstractfactory;

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
