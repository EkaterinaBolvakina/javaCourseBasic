package lessons.lesson_37.optional;

import java.util.Optional;

public class IntegerOptional {

    public static Integer integerOptional(Optional<Integer> optNummer){
        if (optNummer.isPresent()) {
            return optNummer.get() * 2;
        } else {
            return null;
        }
    }
}
