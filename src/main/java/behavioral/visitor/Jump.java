package behavioral.visitor;

public class Jump implements AnimalOperation{
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Jumped 7 feet high and landed back on the ground!");
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Jumped 20 feet high and swing from one tree top another!");
    }

    @Override
    public void visitDog(Dog dog) {
        System.out.println("Jump 3 feet high and turn around again and again to show his Joy");
    }
}
