package homeworks.homework_29.task_04_HashMap;

import java.util.HashMap;
import java.util.Map;

/*
4. **Отслеживание оценок студентов:**
    - Создайте `HashMap`, где ключом является имя студента, а значением - его средний балл.
    - Добавьте данные пяти студентов.
    - Найдите и выведите имя студента с наивысшим средним баллом.
    - Измените средний балл одного из студентов и выведите обновленные данные.
 */
public class StudentGrade {
    public static void main(String[] args) {
        StudentService demo = new StudentService();

        Map<String,Double> studentGradeCollection = new HashMap<>();
        studentGradeCollection.put("Otto",1.5);
        studentGradeCollection.put("Schulz",3.3);
        studentGradeCollection.put("Weber",1.1);
        studentGradeCollection.put("Pelz",2.0);
        studentGradeCollection.put("Sonnenfeld",1.3);

        demo.printStudentGrades(studentGradeCollection);

        demo.findStudentWithBestGrade(studentGradeCollection);
        demo.changeGrade(studentGradeCollection,"Otto",1.0);
        demo.printStudentGrades(studentGradeCollection);
        demo.findStudentWithBestGrade(studentGradeCollection);
    }

}
