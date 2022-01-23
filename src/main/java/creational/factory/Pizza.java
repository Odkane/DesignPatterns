package creational.factory;

public abstract class Pizza {

    public abstract void start();

    public void addIngredient(String ingredient){
        System.out.printf("Adding %s%n", ingredient);
    }

    public void bake(){
        System.out.println("Baking for 10 min .... ");
    }

    public void cut(){
        System.out.println("Pizza is ready for packing ....");
    }

    public void box(){
        System.out.println("Pizza is in the box .....");
    }

    public abstract void delivery();
}
