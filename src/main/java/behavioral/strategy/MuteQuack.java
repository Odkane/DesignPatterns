package behavioral.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public String quack() {
        return "makes no sound";
    }
}
