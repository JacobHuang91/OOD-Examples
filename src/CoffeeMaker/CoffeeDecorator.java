package CoffeeMaker;

/**
 * 所有装饰类的父类
 */
public abstract class CoffeeDecorator implements Coffee {
    // 被装饰的咖啡
    protected final Coffee decoratedCoffee;

    // 需要提供一杯咖啡用来装饰
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
