//Напишите приложение, которое позволяет создать трех студентов у которых есть следующие параметры:
//1) Фамилия
//2) Имя
//3) Номер студенческого
//4) Группа
//
//Запросите у пользователя данные и создайте трех студентов и выведете информацию о них в удобном для вас виде

package lessons.lesson_08.studentsWithGroup;

public class StudentDemo {
    public static void main(String[] args) {

        StudentUtility utility = new StudentUtility();

        System.out.println("Create group: ");
        StudentGroup group = utility.createStudentGroup();

        System.out.println("Add students in the group: ");
        StudentParameters student1 = utility.createStudent(group);
        StudentParameters student2 = utility.createStudent(group);
        StudentParameters student3 = utility.createStudent(group);

        System.out.println("Information about group and students: ");
        student1.printStudentData();
        student2.printStudentData();
        student3.printStudentData();

    }
}
