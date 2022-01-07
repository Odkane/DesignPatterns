package behavioral.visitor;

public class Lion implements Animal{

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }

    void roar(){
        System.out.println("Roooooaaaarr !!!");
    }
}
