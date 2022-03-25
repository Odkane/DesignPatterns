package behavioral.template;

public class Carbonara extends PastaRecipes{
    @Override
    void startCooking() {
        System.out.println("Add oil in the pan");
    }

    @Override
    void addBaseIngredients() {
        System.out.println("Add bacon in the pan");
    }

    @Override
    void addSpice() {
        System.out.println("Add pepper");
        System.out.println("Add the yellow from egg with cheese");
        System.out.println("Add the spaghetti and mix everything");
        System.out.println("Meal is ready! Enjoy.");
    }
}
