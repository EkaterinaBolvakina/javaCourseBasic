package lessons.lesson_30.compareObjects.comparator.task_01;

import java.util.Comparator;

public class PairComparatorId implements Comparator<Pair> {

    @Override
    public int compare(Pair pair1, Pair pair2) {
        return pair1.getId() - pair2.getId();
    }
}
