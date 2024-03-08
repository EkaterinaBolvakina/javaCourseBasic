package homeworks.homework_36.collections.easy;

import java.util.HashMap;

/*
3 Create a HashMap where the key is a number of Integer type and the value is its square.
Display all elements of HashMap on the screen.
 */
public class HashMap_Task_03 {
    public static void main(String[] args) {
        Integer number1 = 10;
        Integer number2 = 5;
        Integer number3 = 3;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(number1,number1 * number1);
        hashMap.put(number2,number2 * number2);
        hashMap.put(number3,number3 * number3);

        System.out.println(hashMap);

    }
}
