package structural.decorator;

public class CaramelTopping extends IceCreamDecorator{

    public CaramelTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getName() {
        return iceCream.getName() + " with caramel topping";
    }

    @Override
    public float getPrice() {
        return iceCream.getPrice() + 0.5f;
    }
}
