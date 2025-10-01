package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private int occupants = 0;
    private int maxCapacity = 0;
    private List<Observer> observers = new ArrayList<>();

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        System.out.println("Room " + roomNumber + " maximum capacity set to " + maxCapacity);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Attach observers like LightSystem or ACSystem
    public void attach(Observer o) {
        observers.add(o);
    }

    // Set occupancy and notify observers
    public void setOccupancy(int count) {
        if (count < 0) {
            System.out.println("Occupants cannot be negative.");
            return;
        }
        occupants = count;

        boolean occupied = occupants >= 2; // Occupancy threshold
        if (occupied) {
            System.out.println("Room " + roomNumber + " is now occupied by " + occupants + " persons.");
        } else {
            System.out.println("Room " + roomNumber + " is now unoccupied.");
        }
        notifyObservers();
    }

    // Notify all observers (AC, Lights)
    private void notifyObservers() {
        boolean occupied = occupants >= 2;
        for (Observer o : observers) {
            o.update(occupied);
        }
    }

    @Override
    public String toString() {
        return "Room " + roomNumber +
                " | Occupants: " + occupants +
                " | Max Capacity: " + maxCapacity;
    }
}
