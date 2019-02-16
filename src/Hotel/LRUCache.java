package Hotel;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * java中的LinkedHashMap可以当做LRU用
 */
public class LRUCache extends LinkedHashMap<Request, Map<RoomType, List<Room>>> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Request,
            Map<RoomType, List<Room>>> eldest) {

        return size() > this.capacity;
    }

}
