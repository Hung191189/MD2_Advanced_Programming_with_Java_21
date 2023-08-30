package Quan_Ly_San_Pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductsManager {
    private final ArrayList<Products> productsList;
    private final Scanner scanner;
    private final WriteAndReadData writeAndReadData;

    public ArrayList<Products> showClass(){
        return productsList;
    }
    public ProductsManager() {
        productsList = new ArrayList<>();
        scanner = new Scanner(System.in);
        writeAndReadData= new WriteAndReadData();
    }
    public void createProducts(){
        System.out.println("Enter product code: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter product introduction: ");
        String introduction = scanner.nextLine();
        Products products = new Products(id, name, price, brand, introduction);
        productsList.add(products);

        writeAndReadData.writeData("D:/IdeaProjects/IO_Binary_File _And_Serialization/src/Quan_Ly_San_Pham/products", productsList);
    }

    public void displayProducts(){
        for (Products products : productsList){
            System.out.println(products);
        }
    }
    public Products displayProductByCode(){
        System.out.println("Enter code you want to display:");
        int code = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getId() == code){
                return productsList.get(i);
            }
        }
        return null;
    }
    public Products findProductByCode(int id){
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getId() == id){
                return productsList.get(i);
            }
        }
        return null;
    }
}

