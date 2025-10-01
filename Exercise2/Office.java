import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<Room> rooms = new ArrayList<>();

    public void configureRooms(int count) {
        rooms.clear();
        for(int i=1;i<=count;i++) rooms.add(new Room(i));
        System.out.print("Office configured with " + count + " meeting rooms: ");
        for(Room r : rooms) System.out.print("Room " + r.getNumber() + " ");
        System.out.println();
    }

    public Room getRoom(int number) {
        if(number <= 0 || number > rooms.size()) {
            System.out.println("Room " + number + " does not exist.");
            return null;
        }
        return rooms.get(number-1);
    }

    public void showStatus() {
        if(rooms.isEmpty()) {
            System.out.println("No rooms configured.");
            return;
        }
        for(Room r : rooms) r.showStatus();
    }
}
