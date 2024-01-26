package lessons.lesson_09.projectNote;

public class NoteDemo {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();
        Note note1 = manager.createNote();
        System.out.print(note1);
    }
}
