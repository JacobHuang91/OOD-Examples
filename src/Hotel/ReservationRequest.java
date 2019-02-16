package Hotel;

import java.util.Date;
import java.util.Map;

public class ReservationRequest {
    private Date startDate;
    private Date endDate;
    // 要定的房型和数量
    // single:1, double:2
    private Map<RoomType, Integer> roomsNeeded;
}
