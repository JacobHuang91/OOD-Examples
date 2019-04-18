package ParkingLot;

/**
 * singleton 静态内部类方法
 * 线程安全，会在编译的时候操作，并且只调用一次
 */
public class ParkingLotStatic {
    private ParkingLotStatic(){};

    private static class LazyParkingLot{
        static final ParkingLotStatic _instance = new ParkingLotStatic();
    }

    public static ParkingLotStatic getInstance(){
        return LazyParkingLot._instance;
    }
}
