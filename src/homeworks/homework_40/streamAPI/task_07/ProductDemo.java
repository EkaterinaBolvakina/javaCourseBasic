package homeworks.homework_40.streamAPI.task_07;

import java.util.*;
import java.util.stream.Collectors;

/*
Task 7) Given Product collection - name, category, price, quantity in stock.
   Find the average price of products of each category, which quantity exceeds the given value
   and sort by descending price
 */
public class ProductDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Adidas Sneakers","Schuhe",199.99,1000));
        products.add(new Product("Rock Orsay","Kleidung",89.99,450));
        products.add(new Product("Nike Sneakers","Schuhe",99.99,600));
        products.add(new Product("Shorts","Kleidung",39.99,1000));
        products.add(new Product("Halskette","Accessory",499.99,100));
        products.add(new Product("Armband","Accessory",199.99,1000));
        products.add(new Product("Boots","Schuhe",99.59,300));

        Map<String,Double> avgPriceByCategory = products.stream()
                .filter(quantityInStock -> quantityInStock.getQuantityInStock() > 500)
                .collect(Collectors.groupingBy(Product::getCategory,
                         Collectors.averagingDouble(Product::getPrice)
                        ));

        // sort by descending price:
        Map<String,Double> sortedAvgPriceByCategory = avgPriceByCategory.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                                        (oldValue,newValue) -> oldValue, LinkedHashMap::new));


        sortedAvgPriceByCategory
                .forEach((category, avgPrice) ->
                System.out.println("Category: "+category +", Average Price: "+ avgPrice));
    }
}
