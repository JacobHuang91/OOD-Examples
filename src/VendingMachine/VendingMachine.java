package VendingMachine;

import javafx.util.Pair;

import java.util.List;
import java.util.Map;

/**
 * 购买过程：
 * 选择商品 -> 显示价格 -> 付款（硬币） -> 比较付款和商品价格 -> 提供商品 -> 找零
 */
public class VendingMachine {
    // 买家输入了什么硬币
    private List<Coin> coins;

    private List<Item> items;

    // 用来提供selection对应的产品信息
    private Map<String, ItemInfo> itemIdentifiers;

    // 买家当前选择的产品
    private ItemInfo currentSelection;

    // 当前买家给的钱
    private List<Coin> currentCoins;

    private Stock stock;

    private State state;

    // 四种状态
    private NoSelectionState noSelectionState;
    private HasSelectionState hasSelectionState;
    private CoinsInsertedState coinsInsertedState;
    private VendingState vendingState;

    public VendingMachine() {
        // 把当前的vending machine都传进去
        // 把具体的操作都交给各种状态，并且伴有状态改变
        noSelectionState = new NoSelectionState(this);
        hasSelectionState = new HasSelectionState(this);
        coinsInsertedState = new CoinsInsertedState(this);
        // 初始状态
        state = noSelectionState;
    }

    //各种状态改变
    public void changeToNoSelectionState() {
        state = noSelectionState;
    }

    public void changeToHasSelectionState() {
        state = hasSelectionState;
    }

    public void changeToCoinsInsertedState() {
        state = coinsInsertedState;
    }

    // 选择产品
    public float selectItem(String selection) {
        state.selectItem(selection);
        return 1.0f;
    }

    // 插入硬币
    public void insertCoins(List<Coin> coins) {
        state.insertCoins(coins);
        this.currentCoins = coins;
    }

    // 执行交易
    // 返回一个商品和找零
    public Pair<Item, List<Coin>> executeTransaction() {
        state.executeTransaction();
        return null;
    }

    // 取消交易
    List<Coin> cancelTransaction() {
        state.cancelTransaction();
        return null;
    }

    // 补货
    // item对象中带有ItemInfo对象
    public void refillItems(List<Item> items) {

    }

    // 找零
    private List<Coin> refund() {
        return null;
    }
}
