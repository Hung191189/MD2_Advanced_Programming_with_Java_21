import java.util.Scanner;

public class MD2_Tim_pt_lon_nhat_trong_mang_2chieu {
    public static void main(String[] args) {
        int [][] arr;
        arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max = " + max);
    }
}
