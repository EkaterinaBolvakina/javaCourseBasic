package homeworks.homework_36.collections.easy;

import java.util.TreeMap;

/*
5 Create a TreeMap where the key is a string and the value is its length. Display all TreeMap elements on the screen.
 */
public class TreeMap_Task_05 {
    public static void main(String[] args) {

        TreeMap<String,Integer> treeMap = new TreeMap<>();

        addElement(treeMap,"Banana");
        addElement(treeMap,"Orange");
        addElement(treeMap,"Banana");
        addElement(treeMap,"Chocolate");

        System.out.println(treeMap);

    }
    public static void addElement(TreeMap<String,Integer> treeMap, String string) {
         treeMap.put(string,string.length());
    }
}
