import java.util.Scanner;

public class MD2_Show_first_100_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        for (int i = 2;i <= num ; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2)
                System.out.println(i);
            }
        }
    }

