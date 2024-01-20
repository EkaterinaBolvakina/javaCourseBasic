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
    public void purchseResult(){
        int sumAfterDiscount = (priceProductA + priceProductB) - discount;
        System.out.println("Total after discount: "+ sumAfterDiscount);
        System.out.println("Discount: " + discount);
    }

}
