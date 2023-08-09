import java.util.Scanner;

public class MD2_Tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money: ");
        double yourMoney = scanner.nextDouble();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Input rate: ");
        double rate = scanner.nextDouble();
        for (int i = 1; i <= month ; i++) {
            yourMoney += yourMoney*(rate/100)/12;
        }
        System.out.println(yourMoney);
    }
}
