package lessons.lesson_27.task2;

import java.util.ArrayList;
import java.util.List;

public class Mentor {
    private String mentorID;
    private String mentorName;
    private List<Course> courses;

    public Mentor(String mentorID, String mentorName) {
        this.mentorID = mentorID;
        this.mentorName = mentorName;
        this.courses = new ArrayList<>(); // sozdat pustoj spisok kursov
    }
    public String getMentorID() {
        return mentorID;
    }

    public String getMentorName() {
        return mentorName;
    }

    public List<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "mentorID='" + mentorID + '\'' +
                ", mentorName='" + mentorName + '\'' +
                ", courses=" + courses +
                '}';
    }


}
