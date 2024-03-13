package homeworks.homework_41.task_03;

import java.util.*;
import java.util.stream.Collectors;

/*
Task 3: Object List Conversion and Aggregation

Task: There is a list of order objects (Order), where each order
contains a list of purchases (List<Purchase>) and the date of the order.
Each purchase contains the name of the product and its cost.
You need to calculate the total cost of all purchases,
made in the current month.
 */
public class PurchaseApp {
    public static void main(String[] args) {
        List<Purchase> purchases1 = new ArrayList<>();
        purchases1.add(new Purchase("Apple", 1.64));
        purchases1.add(new Purchase("Banana", 3.05));
        purchases1.add(new Purchase("Milk", 0.64));

        List<Purchase> purchases2 = new ArrayList<>();
        purchases2.add(new Purchase("Apple", 3.64));
        purchases2.add(new Purchase("Chocolate", 2.99));
        purchases2.add(new Purchase("Milk", 0.64));
        purchases2.add(new Purchase("Butter", 2.79));

        List<Purchase> purchases3 = new ArrayList<>();
        purchases3.add(new Purchase("Bacon", 11.64));
        purchases3.add(new Purchase("Orange", 2.05));
        purchases3.add(new Purchase("Milk", 0.64));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(purchases1, new Date(2024, Calendar.FEBRUARY, 12)));
        orders.add(new Order(purchases3, new Date(2024, Calendar.FEBRUARY, 25)));
        orders.add(new Order(purchases3, new Date(2024, Calendar.MARCH, 5)));
        orders.add(new Order(purchases2, new Date(2024, Calendar.MARCH, 15)));
        orders.add(new Order(purchases1, new Date(2024, Calendar.MARCH, 8)));

        // Calculate the total cost of purchases for each month
        Map<Integer, Double> totalCostByMonth = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> {
                            Calendar orderDate = Calendar.getInstance();
                            orderDate.setTime(order.getOrderDate());
                            return orderDate.get(Calendar.MONTH);
                        },
                        Collectors.summingDouble(order -> order.getPurchaseList().stream()
                                .mapToDouble(Purchase::getProductCost)// analog: (purchase -> purchase.getProductCost())
                                .sum())
                ));

        // Print the total cost for each month
        for (Map.Entry<Integer, Double> entry : totalCostByMonth.entrySet()) {
            System.out.println("Total cost of purchases in month " + (entry.getKey() + 1) + ": " + entry.getValue());
        }
    }
}
