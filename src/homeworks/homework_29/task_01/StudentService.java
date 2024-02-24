package homeworks.homework_29.task_01;
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
        System.out.println("=== VARIANT 2: STUDENT LIST IN REVERSE ORDER ===");
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
