import java.util.Scanner;

public class MD2_Tinh_tong_cacso_motcot_xacdinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr;
        int colum;
        int row;
        System.out.println("Enter row and colum:");
        row = scanner.nextInt();
        colum = scanner.nextInt();
        System.out.println("Enter element off array:");
        arr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][2];
        }
        System.out.println(sum);
    }
}
