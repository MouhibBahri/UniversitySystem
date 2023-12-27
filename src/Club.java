import rooms.Room;
import staff.Student;

import java.util.ArrayList;

public class Club {
    private String clubName;
    private String clubDescription;
    private String clubType;
    private Room clubRoom;
    private ArrayList<Student> clubMembers;

    public Club(String clubName, String clubDescription, String clubType, Room clubRoom) {
        this.clubName = clubName;
        this.clubDescription = clubDescription;
        this.clubType = clubType;
        this.clubRoom = clubRoom;
        this.clubMembers = new ArrayList<>();
    }

    //getters
    public String getClubName() {
        return clubName;
    }
    public String getClubDescription() {
        return clubDescription;
    }
    public String getClubType() {
        return clubType;
    }
    public Room getClubRoom() {
        return clubRoom;
    }
    public ArrayList<Student> getClubMembers() {
        return clubMembers;
    }

    //setters
    public void setClubName(String clubName) {
        this.clubName=clubName;
    }
    public void setClubDescription(String clubDescription) {
        this.clubDescription=clubDescription;
    }
    public void setClubType(String clubType) {
        this.clubType=clubType;
    }
    public void setClubRoom(Room clubRoom) {
        this.clubRoom=clubRoom;
    }
    public void setClubMembers(ArrayList<Student> clubMembers) {
        this.clubMembers=clubMembers;
    }

    public void addMember(Student student){
        if(clubMembers.contains(student)){
            System.out.println("Student already exists");
        }
        else{
            clubMembers.add(student);
        }
    }
    public void removeMember(Student student){
        if(clubMembers.contains(student)){
            clubMembers.remove(student);
        }
        else{
            System.out.println("Student does not exist");
        }
    }

    public String toString() {
        return "Club Name: " + clubName +
                "\nClub Description: " + clubDescription +
                "\nClub Type: " + clubType +
                "\nClub Room: " + clubRoom;
    }
}
