package homeworks.homework_21.inheritance.task_02;

abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

}
