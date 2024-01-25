package homeworks.homework_06.task_02.variante2;

public class WordUtility {

    public Word createWord(){

        ScannerBackground sb = new ScannerBackground();
        String firstWord = sb.inputTextFromKeyboard("Enter first word :");
        String secondWord = sb.inputTextFromKeyboard("Enter second word :");

        Word newWord = new Word(firstWord,secondWord);

        return newWord;

    }
}

