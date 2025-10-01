package behavioral.command;

import behavioral.observer.Room;

public class BookRoomCommand implements Command {
    private Room room;
    public BookRoomCommand(Room room) { this.room = room; }

    @Override
    public void execute() {
        System.out.println("Booking room " + room.getRoomNumber());
    }
}
