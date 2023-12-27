package staff;

import academic.Course;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Professor extends Staff{
    private Map<String, Course> coursesTaught;
    private ArrayList<String> researchInterests;

    public Professor(int idCard, String firstName, String lastName, Date birthDate, String email, String phoneNumber, int staffID, String department, String jobTitle, double salary, Map<String, Course> coursesTaught, ArrayList<String> researchInterests) {
        super(idCard, firstName, lastName, birthDate, email, phoneNumber, staffID, department, jobTitle, salary);
        this.coursesTaught=coursesTaught;
        this.researchInterests=researchInterests;
    }

    //getters
    public Map<String, Course>  getCoursesTaught() {
        return coursesTaught;
    }
    public ArrayList<String> getResearchInterests() {
        return researchInterests;
    }

    //setters
    public void setCoursesTaught(Map<String, Course>  coursesTaught) {
        this.coursesTaught=coursesTaught;
    }
    public void setResearchInterests(ArrayList<String> researchInterests) {
        this.researchInterests=researchInterests;
    }

    public String toString(){
        return super.toString() +
                "\nCourses Taught: " + coursesTaught +
                "\nResearch Interests: " + researchInterests;
    }

    public void addCourseTaught(Course course){
        if(coursesTaught.containsKey(course.getCourseCode())){
            System.out.println("academic.Course already exists");
        }
        else{
            coursesTaught.put(course.getCourseCode(),course);
        }
    }

    public void removeCourseTaught(Course course){
        if(coursesTaught.containsKey(course.getCourseCode())){
            coursesTaught.remove(course.getCourseCode());
        }
        else{
            System.out.println("academic.Course does not exist");
        }
    }

    public void addResearchInterest(String researchInterest){
        if(researchInterests.contains(researchInterest)){
            System.out.println("Research Interest already exists");
        }
        else{
            researchInterests.add(researchInterest);
        }
    }



}
