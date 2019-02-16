package Restaurant;

import java.util.List;
import java.util.Map;

/**
 * table和meal的中间人
 */
public class Order {
    // 这顿饭吃了什么
    private List<Meal> meals;
    // 那个桌子
    private Table table;

    private Map<Table, List<Order>> orders;

    public float getPrice(){
        float res = 0f;
        for (Meal meal : meals){
            res += meal.getPrice();
        }

        return res;
    }
}
