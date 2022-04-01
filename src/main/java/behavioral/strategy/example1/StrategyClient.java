package behavioral.strategy.example1;

public class StrategyClient {

    public static void main(String[] args) {
        FlyBehavior noFly = new NoFly();
        FlyBehavior flyWithWings = new FlyWithWings();
        QuackBehavior squeak = new Squeak();
        QuackBehavior muteQuack = new MuteQuack();

        Duck rubberDuck = new Duck(noFly, muteQuack);
        Duck realDuck = new Duck(flyWithWings, squeak);

        rubberDuck.performFly();
        rubberDuck.performQuack();
        realDuck.performFly();
        realDuck.performQuack();
    }
}
