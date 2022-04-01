package behavioral.strategy.example1;

public class FlyWithWings implements FlyBehavior{
    @Override
    public String fly() {
        return "fly high with wings";
    }
}
