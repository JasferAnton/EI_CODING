# Smart Office Facility Management System

## Overview
The **Smart Office Facility Management System** is a console-based Java application designed to manage conference room bookings, occupancy detection, and automation of air conditioning and lighting based on room occupancy. This project demonstrates the use of **design patterns** such as **Singleton**, **Observer**, **Command**, and **Composite**, providing a scalable and maintainable solution.

---

## Features

### Mandatory Features
- Configure the office with multiple conference rooms.
- Set maximum capacity for each room.
- Book and cancel room bookings.
- Detect occupancy using sensors (simulated).
- Automatically release bookings for unoccupied rooms.
- Control air conditioning and lighting based on room occupancy.

### Optional Features
- Group rooms using the Composite pattern.
- Summary of room usage statistics.
- User notifications (future extension).

---

## Design Patterns Used

### 1. Singleton Pattern
- Ensures that the `OfficeConfig` instance managing all rooms is unique throughout the application.

### 2. Observer Pattern
- `Room` objects notify attached `LightSystem` and `ACSystem` observers when occupancy changes.

### 3. Command Pattern
- Encapsulates operations like booking, cancellation, and occupancy updates into commands for flexible execution.

### 4. Composite Pattern
- Allows grouping of multiple rooms as a single entity to manage them collectively.

---

## Project Structure

SmartOffice/
│
├─ creational/
│ └─ OfficeConfig.java
├─ behavioral/
│ ├─ observer/
│ │ ├─ Room.java
│ │ ├─ Observer.java
│ │ ├─ LightSystem.java
│ │ └─ ACSystem.java
│ └─ command/
│ ├─ Command.java
│ ├─ BookRoomCommand.java
│ ├─ CancelRoomCommand.java
│ └─ UpdateOccupancyCommand.java
├─ structural/
│ ├─ RoomComponent.java
│ ├─ LeafRoom.java
│ └─ CompositeRoom.java
└─ Main.java




---

## How to Run

1. Clone the repository or download the project folder.
2. Ensure Java is installed (Java 8 or above).
3. Navigate to the project root folder in the terminal.
4. Compile all Java files:

```bash
javac creational/OfficeConfig.java behavioral/observer/*.java behavioral/command/*.java structural/*.java Main.java

