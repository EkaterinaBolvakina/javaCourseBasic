package extraPractce.sort;

import java.util.Arrays;

public class SortReverseOrder_ArrayString {
    public static void main(String[] args) {
        String[] names = {"Kate","Pablo","Anna","Robert","Jan"};
        System.out.println("Input array: "+Arrays.toString(names));

        sortSameArrayByIndexReversed(names);
        System.out.println("Sorted same array by index in reverse order: "+ Arrays.toString(names));

        sortSameArrayReversedAlphabetically(names);
        System.out.println("Sorted same array alphabetically in reverse order: "+ Arrays.toString(names));

        Arrays.sort(names);  // sortiert String alphabetisch aufsteigend
        System.out.println("Sorted same array alphabetically in ascending order: "+ Arrays.toString(names));

        String[] sortedArrayByIndex = sortByIndexReversed(names);
        System.out.println("Sorted array by index in reverse order (new array): "+ Arrays.toString(sortedArrayByIndex));

    }
    public static String[] sortByIndexReversed(String[] names){
        int n = names.length;
        String[] sortedArrayByIndex = new String[n]; // create new array!!!
        for (int i = 0; i < n; i++) {
            sortedArrayByIndex[i] = names[n-i-1];
        }
        return sortedArrayByIndex;
    }

    public static void sortSameArrayByIndexReversed(String[] names){ //without creating of new array
        int n = names.length;
        for (int i = 0; i < n/2; i++) {
            String temp = names[i];
            names[i] = names[n-i-1];
            names[n-i-1] = temp;
        }
    }
    public static void sortSameArrayReversedAlphabetically(String[] names){
        int n = names.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (names[j].compareTo(names[j+1])< 0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
    }

}
