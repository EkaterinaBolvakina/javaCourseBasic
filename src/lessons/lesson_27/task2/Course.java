package lessons.lesson_27.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private Mentor mentor;
    private List<Student> students;
    //private String departmentName;

    public Course(String courseName, String courseID, Mentor mentor) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.mentor = mentor;
        this.students = new ArrayList<>();
        mentor.addCourse(this);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public List<Student> getStudents() {
         return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID='" + courseID + '\'' +
                ", mentor=" + mentor +
                //  ", students=" + students +
                '}';
    }
}
