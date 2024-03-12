package homeworks.homework_40.streamAPI.task_04;

import java.util.ArrayList;
import java.util.List;

/*
4) In the list of students - select those three who have the highest grades and sort by year of enrolment
 */
public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Schulz",24,2.4, 2022));
        students.add(new Student("Mustermann",22,5.4,2019));
        students.add(new Student("Schröder",27,4.5,2021));
        students.add(new Student("Otto",24,6.4,2022));
        students.add(new Student("Meyer",23,5.0,2021));
        students.add(new Student("Sonnenfeld",25,6.2,2022));

        List<Student> studentsWithHighestGrade = students.stream()
                .sorted((grade1, grade2) -> {
                    double v = Math.round(grade2.getAvgGrade() - grade1.getAvgGrade());return (int)v;
                })
                .limit(3)
                .sorted((year1, year2) -> {return (year1.getYearOfEnrolment() - year2.getYearOfEnrolment());})
                .toList();
        System.out.println(studentsWithHighestGrade);
    }

}
