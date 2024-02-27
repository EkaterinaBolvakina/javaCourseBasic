package homeworks.homework_30.task_01.withDouble;

public class Flat implements Comparable<Flat>{
    private double area;
    private int roomCount;

    public Flat(double area, int roomCount) {
        this.area = area;
        this.roomCount = roomCount;
    }

    public double getArea() {
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

    @Override  //Variant 1:
    public int compareTo(Flat flatToCompare) {
        int result = roomCount - flatToCompare.roomCount;

        if ( result == 0){
            //  compareResult = (int) (this.area - otherFlat.area); - делать нельзя из-за потери данных при приведении типа
            // т.е. если результат вычитания будет меньше 1 (например 0.9) то
            // в результате приведения к int мы получим просто 0
            result = (int) Math.ceil(area - flatToCompare.area);

        }return result;
    }
/*    @Override // VARIANT 2:
    public int compareTo(Flat otherFlat) {
        if (this.bedroom != otherFlat.getBedroom()) {
            return Integer.compare(this.bedroom, otherFlat.bedroom);
        } else {
            return Double.compare(this.area, otherFlat.area);
        }
    }
 */
}