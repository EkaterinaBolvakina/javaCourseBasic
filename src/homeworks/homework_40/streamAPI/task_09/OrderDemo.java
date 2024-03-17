package homeworks.homework_40.streamAPI.task_09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Task 9) Given a list of Order objects containing information about orders including ID, date, amount and status.
   You need to group the orders by month and calculate the total amount of orders in each month.
 */
public class OrderDemo {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, LocalDate.of(2023,11,5),1200.99,"open"));
        orders.add(new Order(2, LocalDate.of(2023,10,5),3200.99,"closed"));
        orders.add(new Order(3, LocalDate.of(2023,11,16),4200.99,"open"));
        orders.add(new Order(4, LocalDate.of(2023,7,5),1200.99,"open"));
        orders.add(new Order(5, LocalDate.of(2023,10,25),200.99,"closed"));
        orders.add(new Order(6, LocalDate.of(2023,11,15),350.99,"open"));
        orders.add(new Order(7, LocalDate.of(2023,7,5),1000.99,"closed"));

        Map<String,Double> monthlyTotalAmount = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getDate().getYear() + "-" + order.getDate().getMonthValue(),
                        Collectors.summingDouble(order -> order.getAmount())
                ));
        monthlyTotalAmount.forEach((month,totalAmount) ->
                System.out.println("Month: "+ month+", Total Amount: "+totalAmount));
    }
}
