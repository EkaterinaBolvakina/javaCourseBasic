//## 1. Задание №1
//1 Создайте строку через new - I study Basic Java!
//2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//3 Распечатать последний символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//5 Заменить все символы “а” на “о”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Java c помощью метода String.substring().

package homeworks.homework_06.task_01;

public class Line {

    //1 Создайте строку
    String message;

    //2 Method: Напишите метод, который принимает в качестве параметра строку:
    public void setMessage(String message) {this.message = message;}
    public void print(){

        System.out.println(message);
    }
    //3 Method: Распечатать последний символ строки. Используем метод String.charAt().
    public void lineLastSymbol (){
        int lengthLine = message.length();
        System.out.println("This line contains "+lengthLine+" symbols.");
        char lastSymbol = message.charAt(lengthLine - 1);
        System.out.println("The last symbol of this line: "+lastSymbol);
    }
    //4 Method: Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    public void containsUnderLine(){
        String underLine = "Java";
        boolean checkContainsUnderLine = message.contains(underLine);
        System.out.println("Do this line contain the underline " +underLine+" ? "+checkContainsUnderLine);
    }
    //5 Method: Заменить все символы “а” на “о”.
    public void replaceSymbols(){
        String replaceAllSymbols = message.replaceAll("a","o");
        System.out.println("Replace all symbols 'a' by 'o' in this line: "+replaceAllSymbols);
    }
    //6 Method: Преобразуйте строку к верхнему регистру.
    public void lineToUpperCase(){
        String lineAfterUpperCase = message.toUpperCase();
        System.out.println("This line after upper case: "+lineAfterUpperCase);
    }
    //7 Method: Преобразуйте строку к нижнему регистру.
    public void lineToLowerCase(){
        String lineAfterLowerCase = message.toLowerCase();
        System.out.println("This line after lower case: "+lineAfterLowerCase);
    }
    //8 Method: Вырезать строку Java c помощью метода String.substring().
    public void lineSubstring(){
        String underLine = "Java";
        int indexStart = message.indexOf(underLine);
        int underLineLength = underLine.length();
        int indexEnd = indexStart + underLineLength;

        String substringJava = message.substring(indexStart,indexEnd);
        System.out.println("Show only underline 'Java' from this line: "+substringJava);

        System.out.println("=== OR === ");

        String firstPartOfTheLine = message.substring(0,indexStart);
        String lastPartOfTheLine = message.substring(indexEnd);
        String lineWithoutUnderLine = firstPartOfTheLine + lastPartOfTheLine;
        System.out.println("This line without underline 'Java': "+lineWithoutUnderLine);
    }
}
