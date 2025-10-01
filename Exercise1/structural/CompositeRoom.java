package structural;

import java.util.ArrayList;
import java.util.List;

public class CompositeRoom implements RoomComponent {
    private String name;
    private List<RoomComponent> rooms = new ArrayList<>();

    public CompositeRoom(String name) { this.name = name; }

    public void add(RoomComponent room) { rooms.add(room); }
    public void remove(RoomComponent room) { rooms.remove(room); }

    @Override
    public void showStatus() {
        System.out.println("Group: " + name);
        for(RoomComponent r : rooms) r.showStatus();
    }
}

