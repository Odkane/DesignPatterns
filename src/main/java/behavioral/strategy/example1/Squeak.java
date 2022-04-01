package behavioral.strategy.example1;

public class Squeak implements QuackBehavior{
    @Override
    public String quack() {
        return "quack quack";
    }
}