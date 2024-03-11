package homeworks.homework_36.generics.task_08;

import java.util.List;
import java.util.function.Predicate;

public class Method<T>{
    public List<T> filter(List<T> list, Predicate<List<T>> isCorrect) {

        if (isCorrect.test(list)) {
            return list;
        }else {
            return null;
        }

    }
}
