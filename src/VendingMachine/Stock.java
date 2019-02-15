package VendingMachine;

import java.util.List;
import java.util.Map;

/**
 * 如果在Vending machine中写，会显得混乱
 * 而且还要嵌套的调用map
 * 这种情况最好是分出来一个stock来
 */
public class Stock {

    // 产品信息 -> 具体的产品list
    // list中的每一个对应一个具体的产品
    private Map<ItemInfo, List<Item>> stock;

    public int getQuantity(ItemInfo info){
        return 0;
    }

    public void add(Item item){

    }

    public void deduct(ItemInfo info){

    }
}
