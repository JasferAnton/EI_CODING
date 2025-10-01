Smart Office Facility - Console-Based Java Application
Project Overview

This project is a console-based application for managing a smart office facility. It allows users to:

Configure meeting rooms.

Set maximum capacity per room.

Add occupants and automatically track occupancy.

Book and cancel room reservations.

Automatically release bookings if the room becomes unoccupied.

Display the status of all rooms including occupancy, max capacity, and booking status.

The project is designed to focus on logic, code quality, OOP principles, and maintainability, following best practices without using a GUI.

Project Structure
SmartOffice/
│
├─ Main.java              // Entry point of the application
├─ Room.java              // Represents a meeting room
├─ Office.java            // Manages the collection of rooms
├─ BookingManager.java    // Handles booking and cancellation of rooms
└─ OccupancyManager.java  // Handles occupancy updates and AC/light simulation


Features

Configure Rooms
Users can specify the number of meeting rooms in the office.

Set Maximum Capacity
Assign a maximum capacity to each room.

Add Occupants
Add occupants to a room.

Occupants >= 2 → Room marked as occupied, AC and lights turned on.

Occupants < 2 → Occupancy insufficient, AC and lights off if room is empty.

Book and Cancel Rooms
Book rooms for meetings and cancel bookings with proper error handling.

Auto-release Booking
If a room becomes unoccupied, any active booking is automatically released.

Show Room Status
Displays the current status of all rooms (occupancy, max capacity, booking).
