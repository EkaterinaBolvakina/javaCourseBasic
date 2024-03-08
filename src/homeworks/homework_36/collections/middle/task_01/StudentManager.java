package homeworks.homework_36.collections.middle.task_01;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();
    public void addStudent(String name, Integer grade) {
        studentList.add(new Student(name,grade));
    }
    public void sortByGradeInDescOrder() {
        int n = studentList.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if (studentList.get(j).getGrade().compareTo(studentList.get(j+1).getGrade()) < 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j,studentList.get(j+1));
                    studentList.set(j+1, temp);
                }
            }
        }
    }
    public void printArray(){
        System.out.println("Students list: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
