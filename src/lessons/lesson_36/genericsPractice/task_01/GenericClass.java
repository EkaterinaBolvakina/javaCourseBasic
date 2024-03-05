package lessons.lesson_36.genericsPractice.task_01;

public class GenericClass <T, S>{
    private T type;
    private S type2;

    public GenericClass(T type, S type2) {
        this.type = type;
        this.type2 = type2;
    }

    public T getType() {
        return type;
    }

    public S getType2() {
        return type2;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "type=" + type +
                ", type2=" + type2 +
                '}';
    }
}
