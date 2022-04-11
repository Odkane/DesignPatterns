package behavioral.mediator.basis;

public class MediatorClient {
    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        ConcreteColleague mobile = new ConcreteColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");
    }
}