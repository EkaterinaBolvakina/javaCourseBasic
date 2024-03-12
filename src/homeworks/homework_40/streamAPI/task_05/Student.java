package homeworks.homework_40.streamAPI.task_05;

public class Student {
    private String name;
    private int age;
    private double avgGrade;
    private  int yearOfEnrolment;

    public Student(String name, int age, double avgGrade, int yearOfEnrolment) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
        this.yearOfEnrolment = yearOfEnrolment;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getYearOfEnrolment() {
        return yearOfEnrolment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                ", yearOfEnrolment=" + yearOfEnrolment +
                '}';
    }
}
