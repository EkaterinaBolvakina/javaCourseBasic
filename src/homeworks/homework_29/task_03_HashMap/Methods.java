package homeworks.homework_29.task_03_HashMap;

import homeworks.homework_08.ScannerUserInput;

import java.util.Map;
import java.util.Objects;

public class Methods {

    public String inputWord(){
        ScannerUserInput ui = new ScannerUserInput();
        String wordInput = ui.inputText("Please enter a word in english to translate to german: ");
        return wordInput;
    }
    public void findWord(Map<String,String> vocabularyEngDe, String wordInput){
        boolean isContain = true;
        if (vocabularyEngDe.containsKey(wordInput)){
            isContain = true;
        }else {
            System.out.println("Your word is not founded in vocabulary");

        }
        for (Map.Entry<String,String> entry : vocabularyEngDe.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ((isContain = true)&&(Objects.equals(key, wordInput))) {
                System.out.println("translated to german: "+value);
            }
        }
    }
    public void removeWordFromVocabulary(Map<String,String> vocabularyEngDe,String wordInput){

        if (vocabularyEngDe.containsKey(wordInput)){
            vocabularyEngDe.remove(wordInput);
            System.out.println("Word '"+wordInput +"' is removed from vocabulary");
            System.out.println();
        }

    }
    public void print(Map<String,String> vocabularyEngDe){
        System.out.println("------- VOCABULARY -------");
        System.out.println(vocabularyEngDe);
        System.out.println("-----------------------------------------------");
    }
}
