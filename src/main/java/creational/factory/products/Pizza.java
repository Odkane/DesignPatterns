package creational.factory.products;

public abstract class Pizza {
    String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void start(){
        System.out.printf("Starting to make a %s.....\n", name);
    }

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

    public void delivery(){
        System.out.printf("%s is in delivery.....\n\n", name);
    }
}
