package CoffeeMaker;

public class WithSprinkles extends CoffeeDecorator {

    public WithSprinkles(Coffee coffee) {
        super(coffee);
    }

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }
}
