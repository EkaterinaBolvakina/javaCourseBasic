package projects.project_01.project_01_Variant_02;

public class Student {
    private String studentSurname;
    private String studentName;
    private int studentAge;

    public Student(String studentSurname, String studentName, int studentAge) {
        this.studentSurname = studentSurname;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

}
