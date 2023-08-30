package Quan_Ly_San_Pham;

import java.io.Serializable;

public class Products implements Serializable {
    private int id;
    private String name;
    private double price;
    private String brand;
    private String introduction;
    public Products(){
    }
    public Products(int id, String name, double price, String brand, String introduction){
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.introduction = introduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
