package CoffeeMaker;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee coffee) {
        // 调用父类的构造函数
        // 子类可以得到父类的protected
        super(coffee);
    }

    public double getCost() {
        // 告诉我父类的价格，然后 + 0.5
        return super.getCost() + 0.5;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
