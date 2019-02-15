package CoffeeMaker;

public class DarkRoast implements Coffee {
    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getIngredients() {
        return "Dark Roast";
    }
}
