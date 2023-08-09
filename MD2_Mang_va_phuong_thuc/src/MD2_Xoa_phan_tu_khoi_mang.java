import java.util.Arrays;
import java.util.Scanner;

public class MD2_Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr;
        int size = 0;
        int index_del = 0;
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if(size > 10){
                System.out.println("Size do not exceed 10");
            }
        } while (size > 10);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element "+ (i+1) +" :" );
            arr[i] = scanner.nextInt();
        }
        System.out.printf("%-15s","The arr is: ");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("Enter X: ");
            int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                index_del = i;
            }
        }
        int[] arr1 = new int[size-1];
        for (int i = 0; i < index_del; i++) {
            arr1[i] = arr[i];
        }
        for (int i = index_del; i < arr.length-1 ; i++) {
            arr1[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
