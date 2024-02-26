package homeworks.homework_30.task_02;

public class Suitcase {
private String material;
private String size;
private String colour;

    public Suitcase(String material, String size, String colour) {
        this.material = material;
        this.size = size;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
