package Quan_Ly_San_Pham;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadData {
    public void writeData(String path, ArrayList<Products> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Products item : products){
//                oos.writeObject(item);
                System.out.println(item);
            }
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<Products> readData(String path){
        List<Products> listProducts = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listProducts = (List<Products>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return listProducts;
    }
}
