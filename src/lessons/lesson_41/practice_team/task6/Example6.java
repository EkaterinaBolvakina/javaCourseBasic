package lessons.lesson_41.practice_team.task6;

import java.util.ArrayList;
import java.util.List;


/*
найти всех производителей
 */
public class Example6{
    public static void main(String[] args) {

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("iPhone", 1000));
        phoneList.add(new Phone("Samsung", 950));
        phoneList.add(new Phone("Huawei", 750));
        phoneList.add(new Phone("Motorola", 500));
        phoneList.add(new Phone("Nokia", 620));
        phoneList.add(new Phone("Xiaomi", 900));

        List<String> phones = phoneList.stream()
                .map(Phone ::getModel)
                .toList();
        System.out.println(phones);



    }
}
