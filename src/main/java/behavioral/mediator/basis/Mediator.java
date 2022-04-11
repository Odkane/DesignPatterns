package behavioral.mediator.basis;

//Mediator interface
public interface Mediator {
    void send(String message, Colleague colleague);
}
