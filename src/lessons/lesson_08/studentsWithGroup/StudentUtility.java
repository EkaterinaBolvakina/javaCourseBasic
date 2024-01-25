package lessons.lesson_08.studentsWithGroup;

public class StudentUtility {

    ScannerStudent scanStudent;

    public StudentUtility() {this.scanStudent = new ScannerStudent();
    }
    public StudentGroup createStudentGroup(){
        String groupName = scanStudent.inputScannerText("Enter group: ");
        String startDate = scanStudent.inputScannerText("Enter start date of study: ");
        int studentCount = Integer.parseInt(scanStudent.inputScannerText("Enter count of students in the group: "));
        return new StudentGroup(groupName,startDate,studentCount);
    }

    public StudentParameters createStudent(StudentGroup group){

        String lastName = scanStudent.inputScannerText("Enter last name: ");
        String firstName = scanStudent.inputScannerText("Enter first name: ");
        String idNumber = scanStudent.inputScannerText("Enter student card ID: ");

        StudentParameters newStudent = new StudentParameters(lastName,firstName,idNumber,group);
        return newStudent;

    }
}
