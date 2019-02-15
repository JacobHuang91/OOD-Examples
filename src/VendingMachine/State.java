package VendingMachine;

import java.util.List;

/**
 * 表示贩卖机当前的状态
 * - HAS_SELECTION
 * - NO_SELECTION
 * - COINS_INSERTED
 * - VENDING
 * State会受到函数的影响，这是和strategy design不同的
 *
 *   no ----->  has
 *   ^           |
 *   |           |
 *   |           |
 *   |           v
 * vend <----- coins
 */
public interface State {
    public float selectItem(String selection);

    public void insertCoins(List<Coin> coins);

    public Item executeTransaction();

    public List<Coin> cancelTransaction();
}
