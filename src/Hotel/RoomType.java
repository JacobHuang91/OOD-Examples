package Hotel;

public enum RoomType {
    SINGLE(1, 129),
    DOUBLE(2, 199);

    private int capacity;
    private float price;

    RoomType(int capacity, float price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public float getPrice() {
        return price;
    }
}
