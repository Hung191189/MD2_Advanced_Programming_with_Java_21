package MD2_Quan_Ly_San_Pham;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductManager {
    public void editProduct(int id, ArrayList<Product> list, String name, double price) {
        for (Product element:list) {
            if (element.getId() == id) {
                element.setName(name);
                element.setPrice(price);
            }
        }
    }
    public void deleteProduct(int id, ArrayList<Product> list){
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getId() == id){
                iterator.remove();
            }
        }
    }
    public void findProduct(String name, ArrayList<Product> list){
        for (Product product: list) {
            if(product.getName().equals(name)){
                System.out.println(product);
            }
        }
    }
}
