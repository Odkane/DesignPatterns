package behavioral.visitor;

public class Dog implements Animal{

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDog(this);
    }

    void bark(){
        System.out.println("Woof wooof!!");
    }

}
