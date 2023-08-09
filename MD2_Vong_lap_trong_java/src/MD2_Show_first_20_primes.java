import java.util.Scanner;

public class MD2_Show_first_20_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int n = 2;
        int count = 0;
            for (n = 2; ; n++) {
                boolean check = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if(n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.println(n);
                    count++;
                }
                if(count == num){
                    break;
                }
            }

    }
}