import creational.OfficeConfig;
import behavioral.observer.Room;
import behavioral.observer.LightSystem;
import behavioral.observer.ACSystem;
import behavioral.command.*;
import structural.CompositeRoom;
import structural.LeafRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OfficeConfig config = OfficeConfig.getInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SMART OFFICE FACILITY ===");

        // Attach Observer systems to all rooms after configuration
        LightSystem lightSystem = new LightSystem();
        ACSystem acSystem = new ACSystem();

        while (true) {
            System.out.println("\nCommands:");
            System.out.println("1. Configure rooms");
            System.out.println("2. Set room max capacity");
            System.out.println("3. Add occupants");
            System.out.println("4. Book room");
            System.out.println("5. Cancel booking");
            System.out.println("6. Show room status");
            System.out.println("7. Show grouped rooms (Composite)");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number of rooms: ");
                    int n = sc.nextInt();
                    config.configureRooms(n);

                    // Attach observer systems to each room
                    for (int i = 1; i <= n; i++) {
                        Room room = config.getRoom(i);
                        if (room != null) {
                            room.attach(lightSystem);
                            room.attach(acSystem);
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Enter room number: ");
                    int r = sc.nextInt();
                    System.out.print("Enter max capacity: ");
                    int cap = sc.nextInt();
                    Room room = config.getRoom(r);
                    if (room != null) room.setMaxCapacity(cap);
                }
                case 3 -> {
                    System.out.print("Enter room number: ");
                    int r = sc.nextInt();
                    System.out.print("Enter number of occupants: ");
                    int occ = sc.nextInt();
                    Room room = config.getRoom(r);
                    if (room != null) {
                        Command cmd = new UpdateOccupancyCommand(room, occ);
                        cmd.execute();
                    } else {
                        System.out.println("Invalid room number.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter room number to book: ");
                    int r = sc.nextInt();
                    Room room = config.getRoom(r);
                    Command cmd = new BookRoomCommand(room);
                    cmd.execute();
                }
                case 5 -> {
                    System.out.print("Enter room number to cancel booking: ");
                    int r = sc.nextInt();
                    Room room = config.getRoom(r);
                    Command cmd = new CancelRoomCommand(room);
                    cmd.execute();
                }
                case 6 -> config.showStatus();
                case 7 -> {
                    Room room1 = config.getRoom(1);
                    Room room2 = config.getRoom(2);
                    if (room1 != null && room2 != null) {
                        LeafRoom leaf1 = new LeafRoom(room1);
                        LeafRoom leaf2 = new LeafRoom(room2);
                        CompositeRoom group = new CompositeRoom("Conference Section");
                        group.add(leaf1);
                        group.add(leaf2);
                        group.showStatus();
                    } else {
                        System.out.println("Not enough rooms for Composite demo.");
                    }
                }
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

