package homeworks.homework_29.task_01_ArrayList;
import java.util.List;
public class StudentService {

    /* 1. Add Object student to ArrayList: */
    public void addList(List<Student> students,Student student){
        students.add(student);
    }
    /* 2. Print ArrayList: */
    public void printList(List<Student> students){
        System.out.println("==== STUDENT LIST ====");
        System.out.println(students);
        System.out.println("=== VARIANT 1: STUDENT LIST IN REVERSE ORDER ===");
        System.out.println(students.reversed());
        System.out.println("=== VARIANT 2: STUDENT LIST IN REVERSE ORDER (ALPHABETICALLY BY NAME) ===");
        int n = students.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (students.get(j).compareTo(students.get(j + 1)) < 0) {
                    // Swap elements if they are in the wrong order
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        System.out.println(students);
        System.out.println("=== VARIANT 3: STUDENT LIST IN REVERSE ORDER ===");
        for (int i = students.size()-1; i >= 0 ; i--) {
            System.out.println("Student nr."+(i+1)+": "+students.get(i));

        }System.out.println("----------------------------------------------------------------");
    }

    public void removeElementFromList(List<Student> students, int indexToRemove){
        System.out.println("Student "+students.get(indexToRemove)+" with index:"+indexToRemove+" is deleted");
        students.remove(indexToRemove);
        System.out.println("----------------------------------------------------------------");

    }


}
