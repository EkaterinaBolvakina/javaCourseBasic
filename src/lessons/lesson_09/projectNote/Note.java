package lessons.lesson_09.projectNote;

public class Note {
    String noteName;
    String numberNote;
    String descriptionNote;

    public Note(String noteName, String numberNote, String descriptionNote) {
        this.noteName = noteName;
        this.numberNote = numberNote;
        this.descriptionNote = descriptionNote;
    }

    @Override
    public String toString() {
        return "Name of note: " + noteName + '\'' +
                ", Number of note: " + numberNote +
                ", Information: " + descriptionNote + '\''
                ;
    }
}
