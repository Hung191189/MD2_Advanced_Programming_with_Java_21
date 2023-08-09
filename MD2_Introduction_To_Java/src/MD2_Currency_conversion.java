import java.util.Scanner;

public class MD2_Currency_conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Usd: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Vnd = " + vnd);
    }
}