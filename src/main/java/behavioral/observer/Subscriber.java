package behavioral.observer;

public class Subscriber implements Observer{

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notification(String publisherName, String message) {
        System.out.printf("'%s' received notification from '%s', Message: '%s'\n",
                name, publisherName, message);
    }
}