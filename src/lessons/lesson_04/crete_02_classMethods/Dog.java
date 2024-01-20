package lessons.lesson_04.crete_02_classMethods;

public class Dog {
    int age;

    public void dogWoow() {
        System.out.println("Woow woow!!!");
    }
    public void dogBirthday(String textMessage){
        System.out.println(textMessage);
        System.out.println("The dog has birthday today!");
        System.out.println("He was " +age +" years old,");
        age = age + 1;
        System.out.println("and now he is " + age);
    }
}
