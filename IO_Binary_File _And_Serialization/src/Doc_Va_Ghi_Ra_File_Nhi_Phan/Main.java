package Doc_Va_Ghi_Ra_File_Nhi_Phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> listStudents = new ArrayList<>();
        System.out.println("Enter ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        Students students = new Students(id,name,address);
        listStudents.add(students);
        writeDataToFile("D:/IdeaProjects/IO_Binary_File _And_Serialization/src/Doc_Va_Ghi_Ra_File_Nhi_Phan/students.txt",listStudents);
        List<Students> studentsDataFromFile = readDataFormFile("D:/IdeaProjects/IO_Binary_File _And_Serialization/src/Doc_Va_Ghi_Ra_File_Nhi_Phan/students.txt");
        for (Students students1 : studentsDataFromFile){
            System.out.println(students1);
        }
    }public static void writeDataToFile(String path, List<Students> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Students> readDataFormFile(String path){
        List<Students> listStudents = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listStudents = (List<Students>)ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listStudents;
    }

}
