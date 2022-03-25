package behavioral.template;

public class TemplateClient {

    public static void main(String[] args) {
        PastaRecipes recipe = new Carbonara();
        recipe.prepareRecipe();

        System.out.println("--------------------------");
        recipe = new Bolognese();
        recipe.prepareRecipe();
    }
}
