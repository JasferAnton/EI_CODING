public class OccupancyManager {

    public void updateOccupants(Room room, int count) {
        if(room != null) {
            room.setOccupants(count);
            if(count >= 2) {
                System.out.println("Room " + room.getNumber() + " is now occupied by " + count + " persons. AC and lights turned on.");
            } else {
                System.out.println("Room " + room.getNumber() + " occupancy insufficient to mark as occupied.");
                if(count == 0) {
                    System.out.println("Room " + room.getNumber() + " is now unoccupied. AC and lights turned off.");
                    room.cancelBooking();
                }
            }
        } else {
            System.out.println("Invalid room number.");
        }
    }
}
