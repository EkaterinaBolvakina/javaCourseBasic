package homeworks.homework_41.task_03;

public class Purchase {
    private String productName;
    private Double productCost;

    public Purchase(String productName, Double productCost) {
        this.productName = productName;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductCost() {
        return productCost;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "productName='" + productName + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
