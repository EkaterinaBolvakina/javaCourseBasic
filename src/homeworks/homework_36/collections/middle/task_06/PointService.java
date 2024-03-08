package homeworks.homework_36.collections.middle.task_06;

import java.util.TreeSet;

public class PointService {
TreeSet<Point> points = new TreeSet<>();

public void addPoint(Integer x,Integer y) {
    points.add(new Point(x,y));
}

public void printComparedPoints() {
    System.out.println("Only points with x > y: ");
    for (Point point : points) {
        if (point.getX() > point.getY()) {
            System.out.println(point);
        }
    }
}
}
