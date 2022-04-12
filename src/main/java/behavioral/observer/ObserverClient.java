package behavioral.observer;

public class ObserverClient {

    public static void main(String[] args) {

        Publisher obama = new Publisher("Barack Obama");
        Publisher realMadrid = new Publisher("Real Madrid");

        Subscriber david = new Subscriber("David");
        Subscriber marco = new Subscriber("Marco");
        Subscriber rachel = new Subscriber("Rachel");
        Subscriber michael = new Subscriber("Michael");
        Subscriber kim = new Subscriber("Kim");

        obama.addSubscriber(rachel);
        obama.addSubscriber(kim);
        obama.addSubscriber(michael);

        realMadrid.addSubscriber(david);
        realMadrid.addSubscriber(marco);
        realMadrid.addSubscriber(rachel);

        obama.sendMessage("Hello Friends!");
        realMadrid.sendMessage("Y nada mas!");
        obama.removeSubscriber(rachel);
        obama.sendMessage("Stay Home! Stay Safe!");
        realMadrid.addSubscriber(kim);
        realMadrid.sendMessage("Champions League semi final!!");
    }
}