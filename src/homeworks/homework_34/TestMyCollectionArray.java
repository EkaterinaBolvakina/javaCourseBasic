package homeworks.homework_34;

public class TestMyCollectionArray {
    public static void main(String[] args) {
        MyCollectionArray<String> fruits = new MyCollectionArray<>();

        fruits.add("Banana 1");
        fruits.add("Apple 1");
        fruits.add("Banana 2");
        fruits.add("Banana 3");
        fruits.add("Apple 2");
        fruits.add("Banana 4");

        System.out.println(fruits);
        fruits.add(2,"KIWI");
        System.out.println(fruits);
        //fruits.add(12,"KIWI");
        //fruits.add(-3,"KIWI");
        //fruits.add(20,"KIWI");

        fruits.remove(3);
        System.out.println(fruits);

        fruits.remove(11);
        fruits.remove(-3);

        System.out.println(fruits);
        System.out.println(fruits.size());
    }
}
