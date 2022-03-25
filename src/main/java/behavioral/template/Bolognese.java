package behavioral.template;

public class Bolognese extends PastaRecipes{
    @Override
    void startCooking() {
        System.out.println("Add oil in the pan");
    }

    @Override
    void addBaseIngredients() {
        System.out.println("Add some onions");
        System.out.println("Add mincemeat in the pan");
        System.out.println("Add pepper");
        System.out.println("Add salt");

    }

    @Override
    void addSpice() {
        System.out.println("Add tomato sauce and let it cook for 5 min on medium heat");
        System.out.println("Add salt and pepper and some stock");
        System.out.println("the sauce is ready");
        System.out.println("Add the sauce to the spaghetti and mix everything! Enjoy");
    }
}
