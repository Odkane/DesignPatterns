package behavioral.strategy.example1;

public class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performFly(){
        System.out.println(this.getClass().getSimpleName() + " " + flyBehavior.fly());
    }

    public void performQuack(){
        System.out.println(this.getClass().getSimpleName() + " " + quackBehavior.quack());
    }
}
