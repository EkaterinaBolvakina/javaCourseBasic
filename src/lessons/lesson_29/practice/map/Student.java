package lessons.lesson_29.practice.map;

public class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return studentName ;
    }

}
