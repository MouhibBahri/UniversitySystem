package rooms;

public class Classroom extends Room{
    private boolean hasProjector;
    private boolean hasWhiteboard;

    public Classroom(int roomNumber, int capacity, boolean isAvailable, boolean hasProjector, boolean hasWhiteboard) {
        super(roomNumber, capacity, isAvailable);
        this.hasProjector=hasProjector;
        this.hasWhiteboard=hasWhiteboard;
    }

    //getters
    public boolean getHasProjector() {
        return hasProjector;
    }
    public boolean getHasWhiteboard() {
        return hasWhiteboard;
    }

    //setters
    public void setHasProjector(boolean hasProjector) {
        this.hasProjector=hasProjector;
    }
    public void setHasWhiteboard(boolean hasWhiteboard) {
        this.hasWhiteboard=hasWhiteboard;
    }

    public String toString() {
        return super.toString() +
                "\nHas Projector: " + hasProjector +
                "\nHas Whiteboard: " + hasWhiteboard;
    }
}
