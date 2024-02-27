package homeworks.homework_30.task_01.withInteger;

public class Flat implements Comparable<Flat>{
    private int area;
    private int roomCount;

    public Flat(int area, int roomCount) {
        this.area = area;
        this.roomCount = roomCount;
    }

    public int getArea() {
        return area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", roomCount=" + roomCount +
                '}';
    }

    @Override
    public int compareTo(Flat flatToCompare) {
        int result = roomCount - flatToCompare.roomCount;

        if ( result == 0){
            result = area - flatToCompare.area;

        }return result;
    }
}
