package behavioral.template;

public abstract class PastaRecipes {

    public void prepareRecipe(){
        startCooking();
        addBaseIngredients();
        addSpice();
    }
    
    abstract void startCooking();
    abstract void addBaseIngredients();
    abstract void addSpice();
}
