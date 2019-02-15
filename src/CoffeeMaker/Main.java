package CoffeeMaker;

public class Main {

    /**
     * 这里仅展示了decorator的方法
     * @param args
     */
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        printInfo(coffee);

        // 给咖啡添加牛奶
        // 生成一倍新的咖啡
        coffee = new WithMilk(coffee);
        printInfo(coffee);

        coffee = new WithSprinkles(coffee);
        printInfo(coffee);
    }

    public static void printInfo(Coffee coffee) {
        System.out.println("Cost: " + coffee.getCost()
                + "; Ingredients: " + coffee.getIngredients());
    }
}
