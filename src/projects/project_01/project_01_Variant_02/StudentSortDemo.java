package projects.project_01.project_01_Variant_02;

public class StudentSortDemo {
    public static void main(String[] args) {
        StudentService demo = new StudentService();

        Student[] students = demo.createStudentsArrayFromUserInput();
        Student[] studentsFilled = demo.fillStudentsArrayFromUserInput(students);
        demo.printStudents(studentsFilled);
    }
}
