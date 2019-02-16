package Hotel;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;
    // 每个房间的已有的预定时间
    // 101：10月1日 10月2日
    private LRUCache cache;
    // 在哪个城市
    private String city;

    // 根据request返回房间
    // single: 3, double: 2
    public Map<RoomType, Integer> handleSearchRequest(Request request) {
        return null;
    }

    // 在这个日期是否有房间可以预约？
    private boolean isRequestAvailable(Request request) {
        return true;
    }

    public Reservation makeReservation(ReservationRequest request) {
        return null;
    }

    public void cancelReservation(Reservation r){

    }

    public boolean isSameCity(String city){
        return this.city.equals(city);
    }

    // 是不是符合搜索hotel的标准
    // 能不能装下这么多人
    // 时间是不是符合
    public boolean isValidRequest(SearchHotelRequest r){
        return true;
    }
}
