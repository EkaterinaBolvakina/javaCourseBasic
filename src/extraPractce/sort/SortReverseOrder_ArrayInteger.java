package extraPractce.sort;

import java.util.Arrays;

public class SortReverseOrder_ArrayInteger {
    public static void main(String[] args) {
        int[] array = {3, 1, 8, 4, 5, 7, 2, 6};

        // Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("Sorted Array in ascending order: " + Arrays.toString(array));

        // Create a new array with elements in reverse order
        int[] sortedArray = sortArrayReverse(array);
        System.out.println("Array in Reverse Order with creating of NEW Array: " + Arrays.toString(sortedArray));

        // Sort array without creating of new array:
        sortSameArrayReserve(array);
        System.out.println("Same Array in Reverse Order: " + Arrays.toString(array));
    }

    // Function to return a new array with elements in reverse order
    private static int[] sortArrayReverse(int[] inputArray) {
        int n = inputArray.length;
        int[] reversedArray = new int[n]; // create new array!!!

        for (int i = 0; i < n; i++) {
            reversedArray[i] = inputArray[n - i - 1];
        }

        return reversedArray;
    }

    public static void sortSameArrayReserve(int[] array){ //without creating of new array
        int n = array.length;
        for (int i = 0; i < n/2 ; i++) {
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }

    }
}
