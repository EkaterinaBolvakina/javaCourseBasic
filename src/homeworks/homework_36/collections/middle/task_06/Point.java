package homeworks.homework_36.collections.middle.task_06;

public class Point implements Comparable<Point>{
    private Integer x;
    private Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        // Compare first by x, then by y
        int xComparison = getX().compareTo(o.getX());
        if (xComparison == 0) {
            return getY().compareTo(o.getY());
        }
        return xComparison;
    }
}
