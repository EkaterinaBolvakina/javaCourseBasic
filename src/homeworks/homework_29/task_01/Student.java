package homeworks.homework_29.task_01;

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
    public int compareTo(Student otherStudent) {
        // Compare students based on a criterion, such as their names or ages
        // This example compares students based on their names alphabetically

        // Assuming 'name' is a String field
        return this.studentName.compareTo(otherStudent.studentName);
    }
}
