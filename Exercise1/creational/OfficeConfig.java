package creational;

// Correct import for Room class
import behavioral.observer.Room;
import java.util.ArrayList;
import java.util.List;

public class OfficeConfig {
    private static OfficeConfig instance;
    private List<Room> rooms = new ArrayList<>();

    private OfficeConfig() {}

    public static OfficeConfig getInstance() {
        if (instance == null) instance = new OfficeConfig();
        return instance;
    }

    public void configureRooms(int count) {
        rooms.clear();
        for (int i = 1; i <= count; i++) {
            rooms.add(new Room(i));
        }
        System.out.print("Office configured with " + count + " rooms: ");
        for (Room r : rooms) System.out.print("Room " + r.getRoomNumber() + " ");
        System.out.println();
    }

    public Room getRoom(int number) {
        if (number <= 0 || number > rooms.size()) {
            System.out.println("Room " + number + " does not exist.");
            return null;
        }
        return rooms.get(number - 1);
    }

    public void showStatus() {
        for (Room r : rooms) System.out.println(r);
    }
}

