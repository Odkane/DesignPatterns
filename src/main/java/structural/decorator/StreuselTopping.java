package structural.decorator;

public class StreuselTopping extends IceCreamDecorator{

    public StreuselTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getName() {
        return iceCream.getName() + " with streusel topping";
    }

    @Override
    public float getPrice() {
        return iceCream.getPrice() + 0.4f;
    }
}
