package behavioral.strategy;

public class NoFly implements FlyBehavior{
    @Override
    public String fly() {
        return "can't fly!";
    }
}
