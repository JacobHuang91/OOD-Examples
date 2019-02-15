package VendingMachine;

import java.util.List;

public class VendingState implements State {
    @Override
    public float selectItem(String selection) {
        return 0;
    }

    @Override
    public Item executeTransaction() {
        return null;
    }

    @Override
    public List<Coin> cancelTransaction() {
        return null;
    }

    @Override
    public void insertCoins(List<Coin> coins) {

    }
}
