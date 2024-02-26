package homeworks.homework_30.task_02;

import java.util.Comparator;

public class SuitcaseComparatorMaterial implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        return suitcase1.getMaterial().compareTo(suitcase2.getMaterial());
    }
}
