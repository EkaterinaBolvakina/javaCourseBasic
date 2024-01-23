package lessons.lesson_06.publicAndPrivate.moto;

public class MotoDemo {
    public static void main(String[] args) {
        Moto m1 = new Moto("Black", "X5","BMW");

        System.out.println(m1.getColour());
        System.out.println(m1.getModel());
        System.out.println(m1.getProducer());

        m1.setColour("White");
        System.out.println(m1.getColour());

        m1.startRoad();

    }

}
