package ParkingLot;

import java.util.List;

// 每一层的情况
public class Level {
    // 静态的停车场，存放静态的车位
    // 不要存放动态的汽车
    // 每层有几个车位
    private List<Spot> spots;
    // 当前层有几个车位
    private int availableCount;

    public int getAvailableCount(){
        return this.availableCount;
    }
}
