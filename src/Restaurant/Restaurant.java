package Restaurant;

import java.util.List;

/**
 * 客人 -> 餐厅 -> 桌子
 */

public class Restaurant {
    // 桌子
    private List<Table> tables;
    // 菜单
    private List<Meal> menu;

    // 找一个桌子
    public Table findTable() {
        return null;
    }

    // 可以从外部接收一个order
    public void takeOrder(Order order) {

    }

    public void checkout(Order order) {

    }

    // 尝试预约
    public Reservation findTableForReservation(TimePeriod timePeriod) {
        return null;
    }

    // 确定预约
    public void confirmReservation(Reservation reservation) {

    }

    // 取消预约
    public void cancelReservation(Reservation reservation){

    }
}
