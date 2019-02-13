package ParkingLot;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * 要从管理员的角度想问题：一辆车 -> 一个车位
 * 服务类考虑的角度：
 * 1. reservation：是不是能预约 - 本例不考虑
 * 2. serve：什么服务？ - 停车
 * 3. check out：如何结账？ - 重新清空spot，计算price
 */
public class ParkingLot {

    // static表示这个ParkingLot属于这个类而不是某个对象
    private static ParkingLot _instance = null;

    private List<Level> levels;
    private float hourlyRate;

    private ParkingLot() {
        this.levels = new ArrayList<Level>();
    }

    // singleton 模式
    // 访问static变量的函数也要是static的
    // synchronized使得线程安全
    public static synchronized ParkingLot getInstance() {
        if (_instance == null) {
            _instance = new ParkingLot();
        }

        return _instance;
    }

    public int getAvailableCount() {
        // 从每层获得还有多少个spot
        int availableSpots = 0;

        for (Level level : levels) {
            availableSpots += level.getAvailableCount();
        }

        return availableSpots;
    }

    // 给车找车位
    // 具有扩展性，可以输入不同的车辆
    // 根据车的大小找车位
    // 这个函数属于辅助性函数，因此要设置为private
    private List<Spot> findSpotsForVehicle(Vehicle v) {
        return new ArrayList<Spot>();
    }

    // 停车
    // 返回一张票
    public Ticket parkVehicle(Vehicle v) {
        return new Ticket();
    }

    // 清空车位
    private float clearSpot(Ticket t) {
        Time startTime = t.getStartTime();
        float hour = startTime.getHours();

        return hourlyRate * hour;
    }
}
