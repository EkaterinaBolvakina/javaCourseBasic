package homeworks.homework_33.task_02;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Integer productId;
    Map<Integer,Product> productMap = new HashMap<>();

    public void addProduct(int productId, Product product){
        if (!productMap.containsKey(productId)){
            productMap.put(productId,product);
            System.out.println("Product "+product+" is added with ID:"+productId);
        }else {
            System.out.println("Product with ID:"+productId+" exist in catalogue already");
        }
    }
    public void deleteProduct(int productId){
        if (productMap.containsKey(productId)){
            productMap.remove(productId);
            System.out.println("Product with ID:"+productId+" is deleted");
        }else {
            System.out.println("Product with ID:"+productId+" not exist in catalogue");
        }
    }

    public Product findProduct(int productId){

            for (Map.Entry<Integer,Product> entry: productMap.entrySet()){
                if (entry.getKey().equals(productId)){
               return entry.getValue();
            }
        }
        return null;
    }
}
