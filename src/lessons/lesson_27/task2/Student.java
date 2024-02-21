package lessons.lesson_27.task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String studentName;
   // private List<Course> courses;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
     //   this.courses = new ArrayList<>(); // sozdat pustoj spisok kursov
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

  //  public List<Course> getCourses() {
   //     return courses;
  //  }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
            //    ", courses=" + courses +
                '}';
    }
}
