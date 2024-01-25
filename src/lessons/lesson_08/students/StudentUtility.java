package lessons.lesson_08.students;

public class StudentUtility {
    public StudentParameters createStudent(){
        ScannerStudent scanStudent = new ScannerStudent();
        String lastName = scanStudent.inputScannerText("Enter last name: ");
        String firstName = scanStudent.inputScannerText("Enter first name: ");
        String idNumber = scanStudent.inputScannerText("Enter student card ID: ");
        String group = scanStudent.inputScannerText("Enter student group: ");

        StudentParameters newStudent = new StudentParameters(lastName,firstName,idNumber,group);
        return newStudent;

    }
}
