package rooms;

public class Laboratory extends Room{
    private boolean hasLabEquipment;
    private String labType;
    public Laboratory(int roomNumber, int capacity, boolean isAvailable, boolean hasLabEquipment, String labType) {
        super(roomNumber, capacity, isAvailable);
        this.hasLabEquipment=hasLabEquipment;
        this.labType=labType;
    }

    //getters
    public boolean getHasLabEquipment() {
        return hasLabEquipment;
    }
    public String getLabType() {
        return labType;
    }

    //setters
    public void setHasLabEquipment(boolean hasLabEquipment) {
        this.hasLabEquipment=hasLabEquipment;
    }
    public void setLabType(String labType) {
        this.labType=labType;
    }

    public String toString() {
        return super.toString() +
                "\nHas Lab Equipment: " + hasLabEquipment +
                "\nLab Type: " + labType;
    }

}
