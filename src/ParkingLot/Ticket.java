package ParkingLot;

import java.sql.Time;
import java.util.List;

/**
 * 存放车和spot的对应关系
 */
public class Ticket {
    // 哪辆车
    private Vehicle v;

    // 这辆车存了哪个车位
    private List<Spot> spots;

    // 存车时间
    private Time startTime;

    public Time getStartTime(){
        return this.startTime;
    }

}
