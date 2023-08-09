import java.util.Scanner;

public class MD2_Check_for_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("This number is not primes");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a primes");
            else
                System.out.println(number + " is not a primes");
        }

    }
}
