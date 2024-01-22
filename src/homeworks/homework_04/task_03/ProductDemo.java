package homeworks.homework_04.task_03;

public class ProductDemo {
    public static void main(String[] args) {
        Product purchase1 = new Product(1000,500,100);
        purchase1.purchaseResult();
        System.out.println();
// as additional, with other prices:
        Product purchase2 = new Product(2000,700,150);
        purchase2.purchaseResult();
// OR other variant if necessary:
        Product purchase3 = new Product(1000,500,100);
        purchase2.purchaseResult2(1000,500,100);
    }
}
