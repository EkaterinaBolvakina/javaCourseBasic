/*
### Задания с использованием List

1. **Управление списком студентов:**
    - Создайте `ArrayList` для хранения имен студентов.
    - Добавьте в список пять имен студентов.
    - Выведите список студентов в обратном порядке.
    - Удалите студента из списка по индексу и выведите обновленный список.
 */
package homeworks.homework_29.task_01;

import java.util.ArrayList;
import java.util.List;

public class StudentsListDemo {
    public static void main(String[] args) {
        //- Создайте студентов.
        Student student1 = new Student("Otto");
        Student student2 = new Student("Schulz");
        Student student3 = new Student("Weber");
        Student student4 = new Student("Mustermann");
        Student student5 = new Student("Sonnenfeld");

        StudentService service = new StudentService();
        List<Student> studentList = new ArrayList<>();                //- Создайте `ArrayList` для хранения имен студентов.

        //- Добавьте в список пять имен студентов:
        service.addList(studentList,student1);
        service.addList(studentList,student2);
        service.addList(studentList,student3);
        service.addList(studentList,student4);
        service.addList(studentList,student5);

        service.printList(studentList);                               //- Выведите список студентов в обратном порядке.

        service.removeElementFromList(studentList,3);   //- Удалите студента из списка по индексу

        service.printList(studentList);                               //и выведите обновленный список.
    }
}
