package homeworks.homework_30.task_02;

import java.util.Comparator;
import java.util.Objects;

public class SuitcaseComparatorColour implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        return suitcase1.getColour().compareTo(suitcase2.getColour());

    }
}
