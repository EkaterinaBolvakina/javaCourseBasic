package lessons.lesson_29.practice.map;


import java.util.HashMap;
import java.util.Map;

public class DemoGrades {
    public static void main(String[] args) {
        /*Есть список студентов и их годовая оценка по различным предметам (один предмет - одна оценка)
        Написать программу которая принимает данные об оценках студентов
        и предоставляет возможность получить данные об оценках конкретного студента

        Map
        ключ - имена студентов
        значение - коллекция Map (название предмета - оценка)
         */

        Student student1 = new Student("Otto");
        Student student2 = new Student("Weber");
        Student student3 = new Student("Schulz");

        Course course1 = new Course("Mathematik");
        Course course2 = new Course("Literature");

        Map<Course, String> collectionCourseGradeStudent1 = new HashMap<>();
        collectionCourseGradeStudent1.put(course1, "Grade A");
        collectionCourseGradeStudent1.put(course2, "Grade A");

        Map<Course, String> collectionCourseGradeStudent2 = new HashMap<>();
        collectionCourseGradeStudent2.put(course1, "Grade B");
        collectionCourseGradeStudent2.put(course2, "Grade C");

        Map<Course, String> collectionCourseGradeStudent3 = new HashMap<>();
        collectionCourseGradeStudent3.put(course1, "Grade A");
        collectionCourseGradeStudent3.put(course2, "Grade D");

        Map<Student, Map<Course, String>> collectionStudentGrade = new HashMap<>();
        collectionStudentGrade.put(student1, collectionCourseGradeStudent1);
        collectionStudentGrade.put(student2, collectionCourseGradeStudent2);
        collectionStudentGrade.put(student3, collectionCourseGradeStudent3);

        System.out.println(collectionStudentGrade);
        //OR:
        printCollection(collectionStudentGrade);

    }

public static void printCollection(Map<Student, Map<Course, String>> collection){
        for (Map.Entry<Student,Map<Course,String>> entry : collection.entrySet()){
            Student key = entry.getKey();
            Map<Course,String> value = entry.getValue();
            System.out.println("Student "+key+": ");
            System.out.println(value);
        }
}

}
