package homeworks.homework_21.abstraction.task_02;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {
        Violin violin = new Violin();
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        violin.playNote();
        piano.playNote();
        guitar.playNote();
    }
}
