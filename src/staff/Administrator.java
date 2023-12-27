package staff;

import java.util.ArrayList;
import java.util.Date;

public class Administrator extends Staff{
    private String role;
    private ArrayList<String> responsibilities;

    public Administrator(int idCard, String firstName, String lastName, Date birthDate, String email, String phoneNumber, int staffID, String department, String jobTitle, double salary, String role, ArrayList<String> responsibilities) {
        super(idCard, firstName, lastName, birthDate, email, phoneNumber, staffID, department, jobTitle, salary);
        this.role=role;
    }

    //getters
    public String getRole() {
        return role;
    }
    public ArrayList<String> getResponsibilities() {
        return responsibilities;
    }

    //setters
    public void setRole(String role) {
        this.role=role;
    }
    public void setResponsibilities(ArrayList<String> responsibilities) {
        this.responsibilities=responsibilities;
    }

    public String toString(){
        return super.toString() +
                "\nRole: " + role;
    }
}
