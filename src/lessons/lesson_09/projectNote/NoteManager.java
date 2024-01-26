package lessons.lesson_09.projectNote;

import lessons.lesson_08.studentsWithGroup.ScannerStudent;

public class NoteManager {

    ScannerStudent scanner;

    public NoteManager() {
        this.scanner = new ScannerStudent();
    }

    public Note createNote() {
        String noteName = scanner.inputScannerText("Enter note name: ");
        String numberNote = scanner.inputScannerText("Enter number of the note: ");
        String descriptionNote = scanner.inputScannerText("Enter information of the note: ");
        return new Note(noteName,numberNote,descriptionNote);
    }
}
