package homeworks.homework_30.task_02;

public class Suitcase {
private Material material;
private Size size;
private Colour colour;

    public Suitcase(Material material, Size size, Colour colour) {
        this.material = material;
        this.size = size;
        this.colour = colour;
    }

    public Material getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material=" + material +
                ", size=" + size +
                ", colour=" + colour +
                '}';
    }
}
