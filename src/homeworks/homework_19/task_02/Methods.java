package homeworks.homework_19.task_02;

import homeworks.homework_08.ScannerUserInput;

public class Methods {

    /* Variant 1:
    Start situation nr.1: we don't know how much words user want to enter =>
    while + int counter = 0
    1) please enter a word, counter++
    2) do you want to enter a next word (yes/no)? yes => counter++, no => loop end
     */
    public int countEnteredWords(){

        boolean isNextWord = true;
        int counter = 0;

        while (isNextWord){
            ScannerUserInput ui = new ScannerUserInput();
            String word = ui.inputText("Please enter a word: ");
            counter++;
            String questionUserNextWord = ui.inputText("Do you want to enter a next word (yes/no)?");

            if (questionUserNextWord.equals("no")){
                isNextWord = false;
            }
        }
        return counter;
        }
        /* Variant 2:
    Start situation nr.2: we ask user how much words user want to enter =>

    1) int counter: please enter how much words you want to enter?
    2) create array
    3) fill array with words: for: "Please enter a word: "
     */
    int countWords(){
        ScannerUserInput ui = new ScannerUserInput();
        int countWord = ui.inputInt("Please enter how much words you want to enter: ");
        return countWord;
    }
    public String[] createWordsArray(int size){
        String[] words = new String[size];
        return words;
    }
    public String[] fillWordsArray(String[] wordsArray){
        ScannerUserInput ui = new ScannerUserInput();
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = ui.inputText("Please enter a word nr."+(i+1)+": ");
        }
        return wordsArray;
    }

}
