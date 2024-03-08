package homeworks.homework_36.collections.middle.task_04;

public class Element {
    private String name;
    private Integer priority;

    public Element(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public Integer getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
