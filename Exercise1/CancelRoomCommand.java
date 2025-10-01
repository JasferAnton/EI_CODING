package behavioral.command;

import behavioral.observer.Room;

public class CancelRoomCommand implements Command {
    private Room room;
    public CancelRoomCommand(Room room) { this.room = room; }

    @Override
    public void execute() {
        System.out.println("Cancelling room " + room.getRoomNumber());
    }
}
