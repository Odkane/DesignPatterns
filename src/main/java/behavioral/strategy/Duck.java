package behavioral.strategy;

public class Duck {

    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        System.out.println(this.getClass().getSimpleName() + " " + flyBehavior.fly());
    }

    public void performQuack(){
        System.out.println(this.getClass().getSimpleName() + " " + quackBehavior.quack());
    }
}
