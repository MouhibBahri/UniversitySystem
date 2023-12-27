package academic;

import java.util.Date;

public class Exam {
    private String examCode;
    private String examName;
    private Course examCourse;
    private Date examDate;
    public Exam(String examCode, String examName, Course examCourse, Date examDate) {
        this.examCode = examCode;
        this.examName = examName;
        this.examCourse = examCourse;
        this.examDate = examDate;
    }

    //getters
    public String getExamCode() {
        return examCode;
    }
    public String getExamName() {
        return examName;
    }
    public Course getExamCourse() {
        return examCourse;
    }
    public Date getExamDate() {
        return examDate;
    }

    //setters
    public void setExamCode(String examCode) {
        this.examCode=examCode;
    }
    public void setExamName(String examName) {
        this.examName=examName;
    }
    public void setExamCourse(Course examCourse) {
        this.examCourse=examCourse;
    }
    public void setExamDate(Date examDate) {
        this.examDate=examDate;
    }

    public String toString() {
        return "Exam Code: " + examCode +
                "\nExam Name: " + examName +
                "\nExam Course: " + examCourse +
                "\nExam Date: " + examDate;
    }
}
