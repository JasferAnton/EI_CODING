package structural;

import behavioral.observer.Room;

public class LeafRoom implements RoomComponent {
    private Room room;
    public LeafRoom(Room room) { this.room = room; }

    @Override
    public void showStatus() {
        System.out.println("Room " + room.getRoomNumber());
    }
}

