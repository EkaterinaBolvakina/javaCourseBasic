package homeworks.homework_21.inheritance.task_03.employeeApp.service;

import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Subordinate;

public class SubordinatesArray {
    Subordinate[] subordinates = new Subordinate[4]; // For example 1 manager has 4 subordinates

    int subordinateCount = 0;
    public void addSubordinate(Subordinate newSubordinate){
        if (subordinateCount < subordinates.length){
            subordinates[subordinateCount] = newSubordinate;
            subordinateCount++;
        }
    }
    public void printSubordinates() {
        System.out.println("Subordinates: ");
        System.out.println("----------------");
        for (int i = 0; i < subordinates.length; i++) {
            if (subordinates[i] != null) {
                System.out.println("Nr.: "+(i+1));
                subordinates[i].printData();
            }
        }
        System.out.println("----------------");
    }

}
