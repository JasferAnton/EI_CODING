package behavioral.command;

import behavioral.observer.Room;

public class UpdateOccupancyCommand implements Command {
    private Room room;
    private int occupants;
    public UpdateOccupancyCommand(Room room, int occupants) {
        this.room = room;
        this.occupants = occupants;
    }

    @Override
    public void execute() {
        room.setOccupancy(occupants);
    }
}
