import java.util.Scanner;

public class MD2_Tong_duong_cheo_chinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr;
        int row;
        int colum;
        System.out.println("Enter row and colum:");
        row = scanner.nextInt();
        colum = scanner.nextInt();
        arr = new int[row][colum];
        System.out.println("Enter the element off array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("Element off " + i +"," + j +": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("This array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
//        boolean check = false;
//        if(row > colum){
//            check = true;
//        }
        int i = 0;
        int j = 0;
        while (i < row){
            sum += arr[i][j];
            i++;
            j++;
        }
        System.out.println("Tong duong cheo la: " + sum);
    }
}
