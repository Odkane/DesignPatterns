package structural.decorator;

public class VanillaIceCream implements IceCream{
    @Override
    public String getName() {
        return "Vanilla ice cream";
    }

    @Override
    public float getPrice() {
        return 1.20f;
    }
}
