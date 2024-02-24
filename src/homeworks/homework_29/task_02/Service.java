package homeworks.homework_29.task_02;

import java.util.List;

public class Service {
    public  void addList(List<Integer> integerList, int random){
        integerList.add(random);
    }
    public  void printList(List<Integer> integerList){
        System.out.println(integerList);
    }
    public void findMinMax(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            System.out.println("The list is empty or null.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : integerList) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public  void sortList(List<Integer> integerList) { //список в порядке возрастания
        // Sortieren mit "Bubble Sort"
        int n = integerList.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (integerList.get(j) > integerList.get(j+1)) {  // if < ==> v porjadke ubyvanija
                    int temp = integerList.get(j);
                    integerList.set(j,integerList.get(j+1));
                    integerList.set((j+1),temp);
                }
            }
        }
    }
}
