package MD2_Quan_Ly_San_Pham;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        Product product1 = new Product("Nuoc", 1, 10000);
        Product product2 = new Product("Chai", 2, 20000);
        Product product3 = new Product("But", 3, 30000);
        Product product4 = new Product("Pin", 4, 50000);
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        productArrayList.add(product4);
        System.out.println(productArrayList);
        ProductManager productManager = new ProductManager();
        productManager.editProduct(2, productArrayList, "Lo", 2500);
        System.out.println(productArrayList);
        productManager.deleteProduct(1, productArrayList);
        System.out.println(productArrayList);
        productManager.findProduct("But", productArrayList);
        PriceComparator comparator = new PriceComparator();
        Collections.sort(productArrayList, comparator);
        for (Product product: productArrayList) {
            System.out.println(product);
        }
}
}
