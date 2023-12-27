package academic;

import staff.Professor;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private String courseDescription;
    private int courseCredits;
    private String courseType;
    private String courseLevel;
    private ArrayList<Course> coursePrerequisites;
    private Professor courseProfessor;

    public Course(String courseCode, String courseName, String courseDescription, int courseCredits, String courseType, String courseLevel, ArrayList<Course> coursePrerequisites, Professor courseProfessor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
        this.courseType = courseType;
        this.courseLevel = courseLevel;
        this.coursePrerequisites = coursePrerequisites;
        this.courseProfessor = courseProfessor;
    }

    //getters
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public int getCourseCredits() {
        return courseCredits;
    }
    public String getCourseType() {
        return courseType;
    }
    public String getCourseLevel() {
        return courseLevel;
    }
    public ArrayList<Course> getCoursePrerequisites() {
        return coursePrerequisites;
    }
    public Professor getCourseProfessor() {
        return courseProfessor;
    }

    //setters
    public void setCourseCode(String courseCode) {
        this.courseCode=courseCode;
    }
    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription=courseDescription;
    }
    public void setCourseCredits(int courseCredits) {
        this.courseCredits=courseCredits;
    }
    public void setCourseType(String courseType) {
        this.courseType=courseType;
    }
    public void setCourseLevel(String courseLevel) {
        this.courseLevel=courseLevel;
    }
    public void setCoursePrerequisites(ArrayList<Course> coursePrerequisites) {
        this.coursePrerequisites=coursePrerequisites;
    }
    public void setCourseProfessor(Professor courseProfessor) {
        this.courseProfessor=courseProfessor;
    }

    public String toString() {
        return "academic.Course Code: " + courseCode +
                "\nacademic.Course Name: " + courseName +
                "\nacademic.Course Description: " + courseDescription +
                "\nacademic.Course Credits: " + courseCredits +
                "\nacademic.Course Type: " + courseType +
                "\nacademic.Course Level: " + courseLevel +
                "\nacademic.Course Prerequisites: " + coursePrerequisites;
    }
}
