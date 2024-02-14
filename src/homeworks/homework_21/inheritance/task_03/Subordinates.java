package homeworks.homework_21.inheritance.task_03;

import java.util.Arrays;

public class Subordinates {
    Subordinate subordinates1 = new Subordinate("Bublik","Olga","Marketing");
    Subordinate subordinates2 = new Subordinate("Pelz","Helga","HR");
    Subordinate subordinates3 = new Subordinate("Nitsche","Tobias","Accounting");

    Subordinate[] subordinates = {subordinates1,subordinates2,subordinates3};

    public Subordinate[] getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return Arrays.toString(subordinates);
    }
}



