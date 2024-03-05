package lessons.lesson_36.genericsPractice.task_02_interfaceArea;

public class Rectangle<T extends Number> implements Figure{
    private T siteOneLength;
    private T siteTwoLength;

    public Rectangle(T siteOneLength, T siteTwoLength) {
        this.siteOneLength = siteOneLength;
        this.siteTwoLength = siteTwoLength;
    }

    public T getSiteOneLength() {
        return siteOneLength;
    }

    public T getSiteTwoLength() {
        return siteTwoLength;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "siteOneLength=" + siteOneLength +
                ", siteTwoLength=" + siteTwoLength +
                '}';
    }

    @Override
    public Object area() {
        return (siteOneLength.doubleValue() * siteTwoLength.doubleValue());
    }
}
