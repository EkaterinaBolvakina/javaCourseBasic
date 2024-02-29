package homeworks.homework_33.task_02;

public class CatalogeApp {
    public static void main(String[] args) {

        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct(1,new Product("IPad Apple",1266.99));
        productCatalog.addProduct(2,new Product("Mixer Rowenta",25.99));
        productCatalog.addProduct(3,new Product("Shampoo Pantine Prov",6.99));
        productCatalog.addProduct(4,new Product("Magazin 'Spiegel'",12.99));
        productCatalog.addProduct(5,new Product("TV Panasonic",560.99));
        productCatalog.addProduct(6,new Product("Table white",300.99));
        System.out.println();

        productCatalog.deleteProduct(5);
        productCatalog.deleteProduct(3);
        productCatalog.deleteProduct(10);
        System.out.println();

        System.out.println(productCatalog.findProduct(5));
        System.out.println(productCatalog.findProduct(2));
        System.out.println(productCatalog.findProduct(3));
        System.out.println(productCatalog.findProduct(4));
    }

}
