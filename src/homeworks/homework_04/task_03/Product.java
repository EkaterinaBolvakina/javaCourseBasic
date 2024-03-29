package homeworks.homework_04.task_03;

public class Product {
    int priceProductA;
    int priceProductB;
    int discount;
    public Product (int priceProductA, int priceProductB, int discount ){
        this.priceProductA = priceProductA;
        this.priceProductB = priceProductB;
        this.discount = discount;
    }
    public void purchaseResult(){
        int sumAfterDiscount = (priceProductA + priceProductB) - discount;
        System.out.println("Purchase price: ");
        System.out.println("Total after discount: "+ sumAfterDiscount+ " RUB");
        System.out.println("Discount: " + discount+ " RUB");
    }
// OR other variant if necessary:
    public void purchaseResult2 (int priceProductA, int priceProductB, int discount ){
        int sumAfterDiscount = (priceProductA + priceProductB) - discount;
        System.out.println("Purchase price: ");
        System.out.println("Total after discount: "+ sumAfterDiscount+ " RUB");
        System.out.println("Discount: " + discount+ " RUB");
    }
}
