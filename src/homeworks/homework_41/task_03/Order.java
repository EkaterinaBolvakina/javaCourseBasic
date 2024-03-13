package homeworks.homework_41.task_03;

import java.util.Date;
import java.util.List;

public class Order {
    private List<Purchase> purchaseList;
    private Date orderDate;

    public Order(List<Purchase> purchaseList, Date orderDate) {
        this.purchaseList = purchaseList;
        this.orderDate = orderDate;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "purchaseList=" + purchaseList +
                ", orderDate=" + orderDate +
                '}';
    }
}
