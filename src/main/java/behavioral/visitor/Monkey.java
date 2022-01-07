package behavioral.visitor;

public class Monkey implements Animal{

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }

    void howl(){
        System.out.println("Ooh oo ah aah");
    }
}
