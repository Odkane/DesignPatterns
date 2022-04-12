package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{
    List<Observer> subscribers = new ArrayList<>();
    private final String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }


    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
        subscribers.forEach(observer -> observer.notification(name,message));
    }

    public void sendMessage(String message) {
        System.out.printf("\nName: %s, Message: %s\n", name, message);
        notifySubscribers(message);
    }
}