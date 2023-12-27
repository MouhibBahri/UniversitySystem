package rooms;

public abstract class Room {
    private int roomNumber;
    private int capacity;
    private boolean isAvailable;

    public Room(int roomNumber, int capacity, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;

        this.isAvailable = isAvailable;
    }

    //getters
    public int getRoomNumber() {
        return roomNumber;
    }
    public int getCapacity() {
        return capacity;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }

    //setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "Room Number: " + roomNumber +
                "\nCapacity: " + capacity +
                "\nIs Available: " + isAvailable;
    }
}
