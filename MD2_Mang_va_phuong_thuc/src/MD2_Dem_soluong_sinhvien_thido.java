import java.util.Arrays;
import java.util.Scanner;

public class MD2_Dem_soluong_sinhvien_thido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] arr;
        do {
            System.out.println("Enter the size: ");
            size = scanner.nextInt();
            if(size >= 30){
                System.out.println("Do not exceed 30");
            }
        }while (size >= 30);
        arr = new int[size];
        System.out.println("Enter diem so: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("list of mark: " + Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 5 && arr[i] <= 10){
                count++;
            }
        }
        System.out.println("So sv thi do la: "+ count + " nguoi");
    }
}

