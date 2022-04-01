package behavioral.strategy;

public class Squeak implements QuackBehavior{
    @Override
    public String quack() {
        return "quack quack";
    }
}