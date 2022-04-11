package behavioral.mediator.basis;

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}