package behavioral.visitor;

public class AnimalSounds implements AnimalOperation{
    @Override
    public void visitLion(Lion lion) {
        lion.roar();
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        monkey.howl();
    }

    @Override
    public void visitDog(Dog dog) {
        dog.bark();
    }
}
