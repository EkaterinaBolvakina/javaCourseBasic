package lessons.lesson_26.arrayListExamples;

import java.util.ArrayList;

public class AlphabetListDemo {
    public static void main(String[] args) {
        // Создадим ArrayList для хранения букв
        ArrayList<String> alphabet = new ArrayList<>();

        // добавим буквы в коллекцию
        for (char letter = 'А'; letter <= 'Я'; letter++) {
            alphabet.add(String.valueOf(letter));
        }

        // выведем нашу коллекцию в прямом порядке
        printList(alphabet);
        System.out.println();
        // выведем алфавит в обратном порядке
        for (int i = alphabet.size() - 1; i >= 0; i--) {
            System.out.print(alphabet.get(i) + ", ");
        }
        System.out.println();

        ArrayList<String> reserve = reverseList(alphabet);
        printList(reserve);
    }
        private static void printList(ArrayList<String> alphabet){ // выведем нашу коллекцию в прямом порядке
            for (int i = 0; i < alphabet.size(); i++) {
                System.out.print(alphabet.get(i) + ", ");
            }
        }

        private static ArrayList<String> reverseList(ArrayList<String> alphabet){
        ArrayList<String> reverseList = new ArrayList<>(); //create new exemplar of collection
            for (int i = 0; i < alphabet.size(); i++) {
                // если бы мы меняли нашу исходную коллекцию
//            String temp = alphabet.get(i);
//            int reverseIndex = alphabet.size() - 1 - i;
//            alphabet.set(i, alphabet.get(reverseIndex));
//            alphabet.set(reverseIndex, temp);
                reverseList.add(alphabet.get(alphabet.size() - 1 -i));
            }
            return  reverseList;
        }
        }
