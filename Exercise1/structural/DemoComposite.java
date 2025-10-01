import structural.*;
import behavioral.observer.Room;

public class DemoComposite {
    public static void main(String[] args) {
        Room r1 = new Room(1);
        Room r2 = new Room(2);

        LeafRoom leaf1 = new LeafRoom(r1);
        LeafRoom leaf2 = new LeafRoom(r2);

        CompositeRoom group = new CompositeRoom("Conference Section");
        group.add(leaf1);
        group.add(leaf2);

        group.showStatus();
    }
}

