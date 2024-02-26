package homeworks.homework_30.task_02;

import java.util.Comparator;

public class SuitcaseComparatorSize implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        return suitcase1.getSize().compareTo(suitcase2.getSize());
    }
}
