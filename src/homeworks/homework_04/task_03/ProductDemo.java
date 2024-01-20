package homeworks.homework_04.task_03;

public class ProductDemo {
    public static void main(String[] args) {
        Product purchase1 = new Product(1000,500,100);
        purchase1.purchseResult();
        System.out.println();

        Product purchase2 = new Product(1000,700,100);
        purchase2.purchseResult();
    }
}
