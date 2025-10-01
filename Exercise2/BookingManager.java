public class BookingManager {

    public void bookRoom(Room room) {
        if(room != null) room.book();
        else System.out.println("Invalid room number.");
    }

    public void cancelBooking(Room room) {
        if(room != null) room.cancelBooking();
        else System.out.println("Invalid room number.");
    }
}
