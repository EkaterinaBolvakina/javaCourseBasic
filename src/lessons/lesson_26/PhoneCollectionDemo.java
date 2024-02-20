package lessons.lesson_26;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        /*
        создать коллекцию телефонов
        показать что она создана и пустая
        добавить в нее один элемент
        показать что элемент добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один из элементов по индексу
        удалить один из элементов по объекту

         показать коллекцию

         */

        ArrayList<Phone> phonesList = new ArrayList<>();
        System.out.println(phonesList);
        Phone phone1 = new Phone(1,"Model 1","Sumsung", 234.99);
        phonesList.add(phone1);
        System.out.println(phonesList);
        Phone phone2 = new Phone(2,"Model 2","Apple", 2020.99);
        Phone phone3 = new Phone(3,"Model 3","Panasonic", 111.99);
        Phone phone4 = new Phone(4,"Model 4","Sumsung", 500.99);
        Phone phone5 = new Phone(5,"Model 5","Apple pro", 1234.99);
        phonesList.add(phone2);
        phonesList.add(phone3);
        phonesList.add(phone4);
        phonesList.add(phone5);
        System.out.println(phonesList);
        phonesList.remove(2);
        phonesList.remove(phone5);
        System.out.println(phonesList);



        }

}
