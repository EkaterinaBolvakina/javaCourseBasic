//Напишите приложение, которое позволяет создать трех студентов у которых есть следующие параметры:
//1) Фамилия
//2) Имя
//3) Номер студенческого
//4) Группа
//
//Запросите у пользователя данные и создайте трех студентов и выведете информацию о них в удобном для вас виде

package lessons.lesson_08.students;

public class StudentDemo {
    public static void main(String[] args) {

        StudentUtility utility = new StudentUtility();

        System.out.println("Enter data of 1st student: ");
        StudentParameters student1 = utility.createStudent();

        System.out.println("Enter data of 2nd student: ");
        StudentParameters student2 = utility.createStudent();

        System.out.println("Enter data of 3rd student: ");
        StudentParameters student3 = utility.createStudent();

        System.out.println("Information about students: ");

        student1.printStudentData();
        student2.printStudentData();
        student3.printStudentData();

    }
}
