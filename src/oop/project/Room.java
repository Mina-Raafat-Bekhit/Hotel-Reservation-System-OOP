package oop.project;

public class Room {
    protected int roomNumber;
    protected boolean isBooked;
    static int count;
    int index;
    
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        count++;
        index=count;
    }

    public boolean isAvailable() {
        return !isBooked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
