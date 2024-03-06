package homeworks.homework_36.generics;
/*
7)  Создайте класс Optional для представления значения, которое может
    отсутствовать. Реализуйте методы isPresent(), get() и orElse().
    Используйте Generics для возможности хранения в Optional объектов
    разных типов.
 */
public class Optional<T> {
    private T object;

    public Optional(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public boolean isPresent() {
        if (object != null){
            return true;
        } else {
            return false;
        }
    }
    public T orElse(T defaultValue) {
        return isPresent() ? object : defaultValue;
    }

    public static void main(String[] args) {
        System.out.println("Variant 1: ");
        Optional<String> stringOptional = new Optional<>("Sonnenschein");

        System.out.println("Is present? " + stringOptional.isPresent());
        System.out.println("Value: " + stringOptional.get());
        System.out.println("Value OR Default: " + stringOptional.orElse("Default Value"));

        System.out.println("Variant 2: ");
        Optional<String> stringOptional2 = new Optional<>(null);

        System.out.println("Is present? " + stringOptional2.isPresent());
        System.out.println("Value: " + stringOptional2.get());
        System.out.println("Value OR Default: " + stringOptional2.orElse("Default Value"));
    }
}
