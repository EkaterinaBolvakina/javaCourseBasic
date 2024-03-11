package consultation.cons_15.practice.task_01.variantWithOption;

import java.util.Optional;

public class RequestProcess {
    public static void main(String[] args) {
        String text = "text1jdfhsjfduv";
        Integer myValue = 250;
        System.out.println("Request 1: " + checkRequest(text,myValue));

        String text2 = "text1";
        Integer myValue2 = 450;
        System.out.println("Request 2: " + checkRequest(text2,myValue2));
    }
    public static String checkRequest(String text, Integer myValue) {
        if (text.length() > 10) {
            return "Request is not correct. String length is > 10";
        }
        return optionalString(myValue).orElse("String is not correct:Value is out of bound");
    }
   public static Optional<String> optionalString (Integer value) {
        if (value >= 100 && value < 200)
            return Optional.of("Request is received");
        if (value >= 200 && value < 300)
            return Optional.of("OK");
        if (value >= 300 && value < 400)
            return Optional.of("Service request");
        if (value >= 400 && value < 500)
            return Optional.of("User error");
        if (value >= 500 && value <= 550)
            return Optional.of("Server error");
        return Optional.empty();
   }
}
