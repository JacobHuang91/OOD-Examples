package CoffeeMaker;

public class Decaf implements Coffee {
    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getIngredients() {
        return "Decaf";
    }
}
