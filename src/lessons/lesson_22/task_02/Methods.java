package lessons.lesson_22.task_02;

import homeworks.homework_08.ScannerUserInput;

public class Methods {
    public String inputWordFromUser(){
        ScannerUserInput ui = new ScannerUserInput();
        String inputText = ui.inputText("Please enter text: ");
        return inputText;
    }

    public String[] prepareTextArray(String inputText){
        inputText = inputText.trim();
        inputText = inputText.replaceAll("—","");
        inputText = inputText.replaceAll("\\.","");
        inputText = inputText.replaceAll(",","");
        inputText = inputText.replaceAll("\\(","");
        inputText = inputText.replaceAll("\\)","");

        inputText = inputText.replaceAll("  "," ");
        inputText = inputText.toLowerCase();
        return inputText.split(" ");
    }

    // Подсчет количества вхождений заданного слова в текст
    public int countWord(String[] inputText, String wordTarget){
        int count = 0;
        for (int i = 0; i < inputText.length; i++) {
            if (inputText[i].equals(wordTarget)){
                count++;
            }
        }
        return count;
    }

    // Найти самое длинное слово в тексте
    public String findLongestWord(String[] workingArrWords){
        String longestWord="";
        for (int i = 0; i < workingArrWords.length-1; i++) {
                if (workingArrWords[i].length()>longestWord.length()) {
                    longestWord = workingArrWords[i];
                }
        }
        return longestWord;
    }

    //sort // сортировка по алфавиту в обратном порядке:
    public String[] sortTextArray(String[] workingArrWords){
        String[] reversed = workingArrWords.clone();
        for (int i = 0; i < reversed.length-1; i++) {
            for (int j = 0; j < reversed.length-1-i; j++) {
                if (reversed[j].compareTo(reversed[j+1])< 0){
                    String tempWord = reversed[j];
                    reversed[j]= reversed[j+1];
                    reversed[j+1] = tempWord;
                }
            }
        }
        return reversed;
    }


    /*
    public String[] createWordArray(){
        ScannerUserInput ui = new ScannerUserInput();
        int arrSize = ui.inputInt("Please enter a size of word's array: ");
        String[] wordArray = new String[arrSize];
        return wordArray;
    }

    public String[] fillWordArray(String[] wordArrayToFill){
        for (int i = 0; i < wordArrayToFill.length; i++) {
            wordArrayToFill[i] =  inputWordFromUser();
        }
        return wordArrayToFill;
    }

     */
}
