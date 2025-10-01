import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Office office = new Office();
        BookingManager bookingManager = new BookingManager();
        OccupancyManager occupancyManager = new OccupancyManager();

        System.out.println("=== SMART OFFICE FACILITY ===");

        while(true) {
            System.out.println("\nCommands:");
            System.out.println("1. Configure rooms");
            System.out.println("2. Set room max capacity");
            System.out.println("3. Add occupants");
            System.out.println("4. Book room");
            System.out.println("5. Cancel booking");
            System.out.println("6. Show room status");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 -> {
                    System.out.print("Enter number of rooms: ");
                    int n = sc.nextInt();
                    office.configureRooms(n);
                }
                case 2 -> {
                    System.out.print("Enter room number: ");
                    int num = sc.nextInt();
                    Room room = office.getRoom(num);
                    if(room != null) {
                        System.out.print("Enter max capacity: ");
                        int cap = sc.nextInt();
                        room.setMaxCapacity(cap);
                    }
                }
                case 3 -> {
                    System.out.print("Enter room number: ");
                    int num = sc.nextInt();
                    Room room = office.getRoom(num);
                    if(room != null) {
                        System.out.print("Enter number of occupants: ");
                        int occ = sc.nextInt();
                        occupancyManager.updateOccupants(room, occ);
                    }
                }
                case 4 -> {
                    System.out.print("Enter room number to book: ");
                    int num = sc.nextInt();
                    Room room = office.getRoom(num);
                    bookingManager.bookRoom(room);
                }
                case 5 -> {
                    System.out.print("Enter room number to cancel booking: ");
                    int num = sc.nextInt();
                    Room room = office.getRoom(num);
                    bookingManager.cancelBooking(room);
                }
                case 6 -> office.showStatus();
                case 0 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
