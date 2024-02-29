package homeworks.homework_32.task_03;

public class Element implements Comparable<Element> {
    private String element;
    private Priority priority;

    public Element(String element, Priority priority) {
        this.element = element;
        this.priority = priority;
    }

    public String getElement() {
        return element;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element='" + element + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Element other) {
        return priority.compareTo(other.getPriority());
    }
}


