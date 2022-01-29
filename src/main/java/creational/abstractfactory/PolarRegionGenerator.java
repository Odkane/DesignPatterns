package creational.abstractfactory;

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
