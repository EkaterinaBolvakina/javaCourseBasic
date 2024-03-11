package consultation.cons_15.practice.task_01.variantWithFunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class ServiceFunction implements Function<Request, String> {

    private Map<Predicate<Integer>, String> responses;
    /*
    - checking the value and receiving the message
      To receive a message we must:
      use Predicate to check the value and depending on
      the result of the check we get a response (String)
     */

    public ServiceFunction() {                     // generate Constructor, create a list, using Predicate
        this.responses = new LinkedHashMap<>();
        responses.put(v -> v >=100 && v < 200, "Request is received"); //with using Lambda: (v -> v >=100 && v < 200)
        responses.put(v -> v >=200 && v < 300,"Ok");
        responses.put(v -> v >=300 && v < 400, "Service request");
        responses.put(v -> v >=400 && v < 500, "User error");
        responses.put(v -> v >=500 && v <= 550, "Server error");
    }

    @Override
    public String apply(Request request) {
        if (request.getMessage().length() > 10) {
            return "Request is not correct. String length is > 10";
        }
        for (Map.Entry<Predicate<Integer>,String> entry : responses.entrySet()) {
            if (entry.getKey().test(request.getNumber())) {  // here using method of Predicate (.test())
                return entry.getValue();
            }
        }
        return "Request value is out of bound";
    }
}
