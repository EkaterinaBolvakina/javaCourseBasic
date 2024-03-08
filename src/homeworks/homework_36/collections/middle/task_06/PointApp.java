package homeworks.homework_36.collections.middle.task_06;
/*
6) Create a TreeSet and add to it several objects of the Point class that have x and y properties.
Then enumerate all elements of the set and display on the console only those points with x > y.
 */
public class PointApp {
    public static void main(String[] args) {

        PointService service = new PointService();

        service.addPoint(1,2);
        service.addPoint(1,4);
        service.addPoint(5,2);
        service.addPoint(4,2);
        service.addPoint(13,10);
        service.addPoint(1,-2);
        service.addPoint(10,2);

        service.printComparedPoints();
    }
}
