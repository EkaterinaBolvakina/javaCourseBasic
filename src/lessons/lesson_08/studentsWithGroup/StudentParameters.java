package lessons.lesson_08.studentsWithGroup;

public class StudentParameters {
    private String lastName;
    private String firstName;
    private String idNumber;
    private StudentGroup group;

    public StudentParameters(String lastName, String firstName, String idNumber, StudentGroup group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.group = group;
    }

    public void printStudentData(){
        System.out.println("Last name: "+lastName);
        System.out.println("First name: "+firstName);
        System.out.println("Student's card ID: "+idNumber);
        System.out.println("Student's group name: "+group);
    }
}
