package homeworks.homework_36.collections.middle.task_01;
/*
1) Create a Student class with name and grade properties, then create an ArrayList,
  fill it with several Student objects and sort the list by grade in descending order.

 */
public class StudentDemo {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent("Schulz", 2);
        manager.addStudent("Pelz", 4);
        manager.addStudent("Schuster", 3);
        manager.addStudent("Meyer", 1);
        manager.addStudent("Maier", 2);

        manager.printArray();
        manager.sortByGradeInDescOrder();
        System.out.println("After sorting by grade in descending order: "); // Info: the best grade is 5, the worst grade is 1.
        manager.printArray();

    }
}
