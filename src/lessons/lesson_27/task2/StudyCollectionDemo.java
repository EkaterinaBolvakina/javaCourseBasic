package lessons.lesson_27.task2;

import java.util.ArrayList;
import java.util.List;

public class StudyCollectionDemo {
    public static void main(String[] args) {
        Mentor mentor1 = new Mentor("M1","Otto");
        Mentor mentor2 = new Mentor("M2","Weber");

        Course course1 = new Course("Java Basic","C1",mentor1);
        Course course2 = new Course("HTML Basic","C2",mentor2);
        Course course3 = new Course("SQL","C3",mentor1);
        Course course4 = new Course("Linux","C4",mentor1);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        Student student1 = new Student("S1","Schulz");
        Student student2 = new Student("S2","Schneider");
        Student student3 = new Student("S3","Tarko");
        Student student4 = new Student("S4","Bublik");
        Student student5 = new Student("S5","Clemens");
        Student student6 = new Student("S6","Sobko");
        Student student7 = new Student("S7","Nitsche");

        course1.addStudent(student1);
        course2.addStudent(student1);
        course3.addStudent(student1);
        course2.addStudent(student2);
        course1.addStudent(student3);
        course2.addStudent(student4);
        course1.addStudent(student5);
        course2.addStudent(student6);
        course2.addStudent(student7);
        course4.addStudent(student1);

        System.out.println("Students who want to study course "+course1.getCourseName()+": ");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getStudentName());
        }
        System.out.println("Students who want to study course "+course2.getCourseName()+": ");
        for (Student student : course2.getStudents()) {
            System.out.println(student.getStudentName());
        }
        System.out.println("Students who want to study course "+course3.getCourseName()+": ");
        for (Student student : course3.getStudents()) {
            System.out.println(student.getStudentName());
        }
        System.out.println("Students who want to study course "+course4.getCourseName()+": ");
        for (Student student : course4.getStudents()) {
            System.out.println(student.getStudentName());
        }

        System.out.println("Mentor "+mentor1.getMentorName()+" teaches courses: ");
        for (Course course : mentor1.getCourses() ){
            System.out.println(course.getCourseID()+" "+course.getCourseName());
        }
        System.out.println("Mentor "+mentor2.getMentorName()+" teaches courses: ");
        for (Course course : mentor2.getCourses() ){
            System.out.println(course.getCourseID()+" "+course.getCourseName());
        }

        printCourseFromStudent(courses);

    }
    public static void printCourseFromStudent(List<Course> courses){
        List<Student> allStudent = new ArrayList<>();

        for (int i = 0; i < courses.size(); i++) {
            Course currentCourse = courses.get(i);
            allStudent.addAll(currentCourse.getStudents());
        }
        for (Student student : allStudent){
            System.out.println(student);
        }
    }
}
