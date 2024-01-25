package homeworks.homework_06.task_02.variante2;

public class Word {

    String inputWord1;
    String inputWord2;

    public Word(String word1, String word2) {
        this.inputWord1 = word1;
        this.inputWord2 = word2;
    }

    public String resultWord(){
        String firstHalfOfWord1 = inputWord1.substring(0,inputWord1.length()/2);
        String SecondHalfOfWord2 = inputWord2.substring((int) Math.ceil(inputWord2.length()/2.0));
        System.out.println(firstHalfOfWord1+SecondHalfOfWord2);

        return (firstHalfOfWord1+SecondHalfOfWord2);
    }

}
