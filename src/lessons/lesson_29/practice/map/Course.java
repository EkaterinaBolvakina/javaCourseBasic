package lessons.lesson_29.practice.map;

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course: " +
                courseName ;
    }
}
