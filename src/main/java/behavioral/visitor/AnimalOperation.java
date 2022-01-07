package behavioral.visitor;

public interface AnimalOperation {

    void visitLion(Lion lion);
    void visitMonkey(Monkey monkey);
    void visitDog(Dog dog);
}
