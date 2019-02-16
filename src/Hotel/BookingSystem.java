package Hotel;

import java.util.List;

public class BookingSystem {
    private List<Hotel> hotels;
    private PaymentStrategy paymentStrategy;

    // 返回符合条件的hotels
    public List<Hotel> searchHotel(SearchHotelRequest r) {
        return null;
    }

    public Reservation makeReservation(Hotel hotel, ReservationRequest r) {
        return null;
    }

    public void cancelReservation(Reservation r) {

    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(Reservation r){

    }
}
