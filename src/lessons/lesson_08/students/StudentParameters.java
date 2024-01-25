package lessons.lesson_08.students;

public class StudentParameters {
    String lastName;
    String firstName;
    String idNumber;
    String group;

    public StudentParameters(String lastName, String firstName, String idNumber, String group) {
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
