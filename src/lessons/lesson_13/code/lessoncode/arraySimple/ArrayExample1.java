package lessons.lesson_13.code.lessoncode.arraySimple;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 6;
        array [1] = 9;
        array[2] = 3;
        System.out.println(Arrays.toString(array));
        System.out.println("elements in array: " +array[0] +"; " + array[1] +"; " +  array[2]);

        array[0] = 10;
        System.out.println(Arrays.toString(array));
        System.out.println("elements in array: " +array[0] +"; " + array[1] +"; " +  array[2]);

        array[2] = 10;
        System.out.println("elements in array: " +array[0] +"; " + array[1] +"; " +  array[2]);
        System.out.println("array[0] == array[1] is ");
        System.out.println(array[0] == array[1] );
        System.out.println( " because element with index 0 is: "+array[0]+
                            " and element with index 1 is: "+array[1]);
        System.out.println(array[0] == array[2]);


        String [] stringArray = {"  word1  ", "word2", "word3", "word1"};
        stringArray[0] = stringArray[0].trim(); // trim() löscht Leerzeichen im Text
        System.out.println(Arrays.toString(stringArray)); // zeigt das Array in Konsole
        System.out.println(stringArray[0].equals(stringArray[3]));




    }
}
