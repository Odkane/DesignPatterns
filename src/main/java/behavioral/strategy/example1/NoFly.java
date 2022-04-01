package behavioral.strategy.example1;

public class NoFly implements FlyBehavior{
    @Override
    public String fly() {
        return "can't fly!";
    }
}
