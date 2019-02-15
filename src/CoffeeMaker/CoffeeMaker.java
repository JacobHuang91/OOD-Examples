package CoffeeMaker;

/**
 * CoffeePack -> coffeeMaker -> Expresso
 * <p>
 * 重点：decorator
 * <p>
 * Decorator pattern allows a user to add new functionality to an existing
 * object without altering its structure. This type of design pattern comes
 * under structural pattern as this pattern acts as a wrapper to existing
 * class.
 */
public class CoffeeMaker {
    public Coffee brewCoffee(CoffeePack pack) {
        return new SimpleCoffee();
    }
}
