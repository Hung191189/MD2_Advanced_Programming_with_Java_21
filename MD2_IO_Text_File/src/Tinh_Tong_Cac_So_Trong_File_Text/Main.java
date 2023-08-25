package Tinh_Tong_Cac_So_Trong_File_Text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFile readFile = new ReadFile();
        readFile.readFileText(path);
    }
}
