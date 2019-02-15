package VendingMachine;

import java.util.List;

public class NoSelectionState implements State {

    VendingMachine vendingMachine;

    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public float selectItem(String selection) {
        vendingMachine.selectItem(selection);
        vendingMachine.changeToHasSelectionState();
        return 0;
    }

    // 当前这种状态不能调用下面的函数
    // 所以显示错误信息
    @Override
    public Item executeTransaction() {
        System.out.println("Please make a selection first");
        return null;
    }

    @Override
    public List<Coin> cancelTransaction() {
        System.out.println("Please make a selection first");
        return null;
    }

    @Override
    public void insertCoins(List<Coin> coins) {
        System.out.println("please make a selection first");
    }
}
