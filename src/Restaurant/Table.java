package Restaurant;

import java.util.List;

public class Table {
    // 桌子是否能用
    private boolean available;

    // 桌子能坐几个人
    private int capacity;

    // 表示一个时间段
    private List<TimePeriod> reservations;


    public boolean isAvailable() {
        return this.available;
    }

    // 函数意义更明确
    public void markUnavailable() {

    }

    public void markAvailable(){

    }

    public int getCapacity(){
        return capacity;
    }
}
