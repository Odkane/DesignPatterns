package behavioral.visitor;

public class VisitorClient {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Monkey monkey = new Monkey();
        Lion lion = new Lion();

        AnimalOperation sounds = new AnimalSounds();

        dog.accept(sounds);
        lion.accept(sounds);
        monkey.accept(sounds);

        System.out.println("-------------------------------");
        AnimalOperation jump = new Jump();

        dog.accept(jump);
        lion.accept(jump);
        monkey.accept(jump);
    }
}
