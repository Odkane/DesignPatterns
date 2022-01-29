package creational.abstractfactory;

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
