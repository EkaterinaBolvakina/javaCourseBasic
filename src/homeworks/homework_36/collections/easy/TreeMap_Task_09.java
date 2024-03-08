package homeworks.homework_36.collections.easy;

import java.util.TreeMap;

/*
9 Create a TreeMap where the key is a number of Integer type and the value is its factorial.
Display all elements of TreeMap on the screen.
 */
public class TreeMap_Task_09 {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> factorial = new TreeMap<>();
        addElement(factorial,5);
        System.out.println(factorial);

    }
    public static void addElement(TreeMap<Integer,Integer> factorial, Integer integer) {
        int item = 1;
        int value = 1;
        while (item <= integer){
            value = value * item++;
        }
        factorial.put(integer,value);
    }
}
