package projects.project_01.project_01_Variant_02;

import homeworks.homework_08.ScannerUserInput;

public class StudentService {

    public Student[] createStudentsArrayFromUserInput(){
        ScannerUserInput ui = new ScannerUserInput();
        int arraySize = ui.inputInt("Please enter a number of students: ");
        Student[] students = new Student[arraySize];
        return students;
    }

    public Student[] fillStudentsArrayFromUserInput(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudentFromUserInput();
        }
        return students;
    }

    public Student createStudentFromUserInput(){
        ScannerUserInput ui = new ScannerUserInput();
        String studentSurname = ui.inputText("Please enter surname of student: ");
        String studentName = ui.inputText("Please enter name of student: ");
        int studentAge = ui.inputInt("Please enter age of student: ");
        Student student = new Student(studentSurname, studentName, studentAge);
        return student;
    }

    public void sortStudents(Student[] students){
        // Variant1: sort with using of loop "for" and "compare" for String:
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getStudentSurname().compareTo(students[j].getStudentSurname()) > 0) {
                    // Tausche die Positionen, wenn die Reihenfolge falsch ist
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
         /* Or Variant 2: With using Comparator:
       Arrays.sort(students, Comparator.comparing(Student::getStudentSurname));
         Or variant3:
       Arrays.sort(students, (s1, s2) -> s1.getStudentSurname().compareTo(s2.getStudentSurname()));
         */
        }
    public void printStudents(Student[] students) {
        sortStudents(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student nr." + (i + 1));
            System.out.println("Surname: " + students[i].getStudentSurname());
            System.out.println("Name: " + students[i].getStudentName());
            System.out.println("Age: " + students[i].getStudentAge());
            System.out.println("-----------------------------------");
        }
    }
}
