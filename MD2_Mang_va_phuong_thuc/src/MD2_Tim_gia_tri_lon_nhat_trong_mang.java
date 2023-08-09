import java.util.Scanner;

public class MD2_Tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("size do not more than 20: ");
            }
        }while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Arr list: ");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}