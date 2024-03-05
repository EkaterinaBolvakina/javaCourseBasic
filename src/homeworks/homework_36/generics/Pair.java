package homeworks.homework_36.generics;
/*
3)  Создайте класс Pair с двумя полями - first и second, и реализуйте
    методы getFirst() и getSecond() для доступа к этим полям.
    Используйте Generics для возможности хранения в Pair объектов
    разных типов.
 */
public class Pair <T, S>{
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> stringPair = new Pair<>("Salat",120);

        System.out.println(stringPair.getFirst());
        System.out.println(stringPair.getSecond());
    }
}
