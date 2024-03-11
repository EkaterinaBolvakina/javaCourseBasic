package homeworks.homework_38.task_05;

import java.util.function.Predicate;

// 5. Write a functional interface to check if a number is prime.
public class CheckIfPrimeNumber {
    public static void main(String[] args) {

//Variant 1: Using FI FICheck:

        FICheck<Boolean,Integer> checkIfPrimeNumber = (num) ->
        {  if (num < 2 ) {
            return false; // Numbers less than 2 are not prime
        }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0 ) {
                    return false; // If num is divisible by any number between 2 and sqrt(num) or "Square Root" (Quadratwurzel), it's not prime
                }
            }
            return true;
        };

        int numberToCheck = 17;
        if (checkIfPrimeNumber.check(numberToCheck)) {
            System.out.println(numberToCheck + " is prime");
        }else {
            System.out.println(numberToCheck + " is not prime");
        }

//Variant 2: Using FI Predicate:
        Predicate<Integer> checkIfPrimeNumberPredicate = (num) ->
        {  if (num < 2 ) {
            return false; // Numbers less than 2 are not prime
        }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0 ) {
                    return false; // If num is divisible by any number between 2 and sqrt(num) or "Square Root" (Quadratwurzel), it's not prime
                }
            }
            return true;
        };

        int numberToCheckForPredicate = 17;
        if (checkIfPrimeNumberPredicate.test(numberToCheck)) {
            System.out.println(numberToCheckForPredicate + " is prime");
        }else {
            System.out.println(numberToCheckForPredicate + " is not prime");
        }
    }
}


