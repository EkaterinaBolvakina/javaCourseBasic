package lessons.lesson_36.genericsPractice.task_01;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        String name = "Anna";
        Integer number = 20;
        List<String> list = new ArrayList<>();

        GenericClass<String,Integer> variant1 = new GenericClass<>(name,number);
        GenericClass<Integer,String> variant2 = new GenericClass<>(number,name);
        GenericClass<Integer,List<String>> variant3 = new GenericClass<>(number,list);

        System.out.println(variant1);
        System.out.println(variant2);
        System.out.println(variant3);




    }
}
