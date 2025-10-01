public class Room {
    private int number;
    private int maxCapacity;
    private int occupants;
    private boolean booked;

    public Room(int number) {
        this.number = number;
        this.maxCapacity = 0;
        this.occupants = 0;
        this.booked = false;
    }

    public int getNumber() { return number; }
    public int getOccupants() { return occupants; }
    public int getMaxCapacity() { return maxCapacity; }
    public boolean isBooked() { return booked; }

    public void setMaxCapacity(int capacity) {
        if(capacity > 0) {
            this.maxCapacity = capacity;
            System.out.println("Room " + number + " maximum capacity set to " + capacity);
        } else {
            System.out.println("Invalid capacity. Enter a positive number.");
        }
    }

    public void setOccupants(int count) {
        if(count < 0) {
            System.out.println("Occupants cannot be negative.");
            return;
        }
        this.occupants = count;
    }

    public void book() {
        if(booked) System.out.println("Room " + number + " is already booked.");
        else {
            booked = true;
            System.out.println("Room " + number + " booked successfully.");
        }
    }

    public void cancelBooking() {
        if(booked) {
            booked = false;
            System.out.println("Booking for Room " + number + " cancelled successfully.");
        } else {
            System.out.println("Room " + number + " is not booked.");
        }
    }

    public void showStatus() {
        String status = "Room " + number + " | Occupants: " + occupants + " | Max Capacity: " + maxCapacity + " | Booked: " + booked;
        System.out.println(status);
    }
}
