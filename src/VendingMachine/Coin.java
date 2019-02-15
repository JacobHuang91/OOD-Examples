package VendingMachine;

/**
 * 硬币种类
 */
public enum Coin {
    // 1分钱
    PENNY(1),
    // 5分钱
    NICKLE(5),
    // 10分钱
    DIME(10),
    // 25分钱
    QUARTER(25);

    private float value;

    Coin(float value) {
        this.value = value;
    }
}
