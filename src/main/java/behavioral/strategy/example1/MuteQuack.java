package behavioral.strategy.example1;

public class MuteQuack implements QuackBehavior{
    @Override
    public String quack() {
        return "makes no sound";
    }
}
