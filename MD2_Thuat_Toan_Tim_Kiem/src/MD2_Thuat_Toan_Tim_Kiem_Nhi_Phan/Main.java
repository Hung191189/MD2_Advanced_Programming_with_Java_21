package MD2_Thuat_Toan_Tim_Kiem.src.MD2_Thuat_Toan_Tim_Kiem_Nhi_Phan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        System.out.println("Enter number:");
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("Enter key:");
        int key = scanner.nextInt();
        System.out.println(BinarySearch.binarySearch(arr, key));
    }
}

