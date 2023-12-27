import rooms.Room;
import staff.Staff;
import staff.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Event {
    private String eventName;
    private String eventDescription;
    private Date eventDate;
    private Room eventRoom;
    private Club eventClub;
    private ArrayList<Staff> eventStaff;
    private ArrayList<Student> eventAttendees;

    public Event(String eventName, String eventDescription, Date eventDate, Room eventRoom, Club eventClub, ArrayList<Staff> eventStaff, ArrayList<Student> eventAttendees) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.eventRoom = eventRoom;
        this.eventClub = eventClub;
        this.eventStaff = eventStaff;
        this.eventAttendees = eventAttendees;
    }

    //getters
    public String getEventName() {
        return eventName;
    }
    public String getEventDescription() {
        return eventDescription;
    }
    public Date getEventDate() {
        return eventDate;
    }
    public Room getEventRoom() {
        return eventRoom;
    }
    public Club getEventClub() {
        return eventClub;
    }
    public ArrayList<Staff> getEventStaff() {
        return eventStaff;
    }
    public ArrayList<Student> getEventAttendees() {
        return eventAttendees;
    }

    //setters
    public void setEventName(String eventName) {
        this.eventName=eventName;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription=eventDescription;
    }
    public void setEventDate(Date eventDate) {
        this.eventDate=eventDate;
    }
    public void setEventRoom(Room eventRoom) {
        this.eventRoom=eventRoom;
    }
    public void setEventClub(Club eventClub) {
        this.eventClub=eventClub;
    }
    public void setEventStaff(ArrayList<Staff> eventStaff) {
        this.eventStaff=eventStaff;
    }
    public void setEventAttendees(ArrayList<Student> eventAttendees) {
        this.eventAttendees=eventAttendees;
    }

}
