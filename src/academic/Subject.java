package academic;

import java.util.ArrayList;

public class Subject {
    private String subjectCode;
    private String subjectName;
    private ArrayList<Course> subjectCourses;

    public Subject(String subjectCode, String subjectName, ArrayList<Course> subjectCourses) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectCourses = subjectCourses;
    }

    //getters
    public String getSubjectCode() {
        return subjectCode;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public ArrayList<Course> getSubjectCourses() {
        return subjectCourses;
    }

    //setters
    public void setSubjectCode(String subjectCode) {
        this.subjectCode=subjectCode;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName=subjectName;
    }
    public void setSubjectCourses(ArrayList<Course> subjectCourses) {
        this.subjectCourses=subjectCourses;
    }

    public void addCourse(Course course) {
        if(subjectCourses.contains(course)) {
            System.out.println("Course already exists");
        }
        else {
            subjectCourses.add(course);
        }
    }

    public void removeCourse(Course course) {
        if(subjectCourses.contains(course)) {
            subjectCourses.remove(course);
        }
        else {
            System.out.println("Course does not exist");
        }
    }

    public String toString() {
        return "Subject Code: " + subjectCode +
                "\nSubject Name: " + subjectName +
                "\nSubject Courses: " + subjectCourses;
    }
}
