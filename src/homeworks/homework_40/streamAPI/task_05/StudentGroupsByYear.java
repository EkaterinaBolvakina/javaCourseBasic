package homeworks.homework_40.streamAPI.task_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 5) From the list of students - group the data by year of admission
public class StudentGroupsByYear {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Schulz",24,2.4, 2022));
        students.add(new Student("Mustermann",22,5.4,2019));
        students.add(new Student("Schröder",27,4.5,2021));
        students.add(new Student("Otto",24,6.4,2022));
        students.add(new Student("Meyer",23,5.0,2021));
        students.add(new Student("Sonnenfeld",25,6.2,2022));

        Map<Integer,List<Student>> studentMap = students.stream()
                .collect(Collectors.groupingBy(student -> student.getYearOfEnrolment())); // analog:  .collect(Collectors.groupingBy(Student::getYearOfEnrolment));

        System.out.println(studentMap);

    }
}
