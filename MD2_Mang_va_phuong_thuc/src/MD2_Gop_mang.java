import java.util.Arrays;
import java.util.Scanner;

public class MD2_Gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1;
        int [] arr2;
        int [] arrAll;
        int size1;
        int size2;
        do {
            System.out.println("Enter size arr1: ");
            size1 = scanner.nextInt();
            if (size1 > 5){
                System.out.println("Do not exceed 5");
            }
        }while (size1 >5);
        do {
            System.out.println("Enter size arr2: ");
            size2 = scanner.nextInt();
            if(size2 > 5){
                System.out.println("Do not exceed 5");
            }
        }while (size2 >5);
        arr1 = new int[size1];
        arr2 = new int[size2];
        System.out.println("Enter element arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("The element " + (i+1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter element arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("The element " + (i+1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arrAll = new int[(arr1.length + arr2.length)];
        System.arraycopy(arr1, 0, arrAll, 0, arr1.length);
        System.arraycopy(arr2, 0, arrAll, (arr1.length), (arrAll.length-arr1.length));
        System.out.println(Arrays.toString(arrAll));
    }
}
