package staff;

import java.util.Date;

public abstract class Staff extends Person{
    private int staffID;
    private String department;
    private String jobTitle;
    private double salary;

    public Staff(int idCard, String firstName, String lastName, Date birthDate, String email, String phoneNumber, int staffID, String department, String jobTitle, double salary) {
        super(idCard, firstName, lastName, birthDate, email, phoneNumber);
        this.staffID=staffID;
        this.department=department;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    //getters
    public int getStaffID() {
        return staffID;
    }
    public String getDepartment() {
        return department;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }

    //setters
    public void setStaffID(int staffID) {
        this.staffID=staffID;
    }
    public void setDepartment(String department) {
        this.department=department;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle=jobTitle;
    }
    public void setSalary(double salary) {
        this.salary=salary;
    }

    public String toString() {
        return super.toString() +
                "\nstaff.Staff ID: " + staffID +
                "\nDepartment: " + department +
                "\nJob Title: " + jobTitle +
                "\nSalary: " + salary;
    }
}
