import java.util.Arrays;
import java.util.Scanner;

public class MD2_Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 10){
                System.out.println("Do not exceed 10.");
            }
        }while (size > 10);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " +(i+1)+ ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.printf("%-15s","The arr is: ");
        for (int j : arr) {
            System.out.print(j +"\t");
        }
        System.out.println("\nEnter index: ");
        int index = scanner.nextInt();
        System.out.println("Enter X: ");
        int x = scanner.nextInt();
        int[] arr1 = new int[arr.length+1];
        arr1[index] = x;
        System.arraycopy(arr, 0, arr1, 0, index);
        System.arraycopy(arr, index, arr1, index +1, arr1.length - (index +1));
        System.out.println(Arrays.toString(arr1));
    }
}
