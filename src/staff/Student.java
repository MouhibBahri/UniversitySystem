package staff;

import academic.Subject;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person{
    private int studentID;
    private String program;
    private int enrollmentYear;
    private ArrayList<Subject> subjects;


    public Student(int idCard, String firstName, String lastName, Date birthDate, String email, String phoneNumber, int studentID, String program, int enrollmentYear) {
        super(idCard, firstName, lastName, birthDate, email, phoneNumber);
        this.studentID=studentID;
        this.program=program;
        this.enrollmentYear=enrollmentYear;
        this.subjects = new ArrayList<>();
    }

    //getters
    public int getStudentID() {
        return studentID;
    }
    public String getProgram() {
        return program;
    }
    public int getEnrollmentYear() {
        return enrollmentYear;
    }
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    //setters
    public void setStudentID(int studentID) {
        this.studentID=studentID;
    }
    public void setProgram(String program) {
        this.program=program;
    }
    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear=enrollmentYear;
    }
    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects=subjects;
    }

    public void addSubject(Subject subject){
        if(subjects.contains(subject)){
            System.out.println("Subject already exists");
        }
        else{
            subjects.add(subject);
        }
    }
    public void removeSubject(Subject subject){
        if(subjects.contains(subject)){
            subjects.remove(subject);
        }
        else{
            System.out.println("Subject does not exist");
        }
    }

    public void takeExam(){
        System.out.println("Student is taking exam");
    }


    public String toString() {
        return super.toString() +
                "\nstaff.Student ID: " + studentID +
                "\nProgram: " + program +
                "\nEnrollment Year: " + enrollmentYear;
    }
}
