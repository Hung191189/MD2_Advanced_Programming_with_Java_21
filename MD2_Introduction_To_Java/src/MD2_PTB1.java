import java.util.Scanner;

public class MD2_PTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a*x + b = c");
        System.out.println("a ");
        double a = scanner.nextDouble();
        System.out.println("b ");
        double b = scanner.nextDouble();
        System.out.println("c ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.println(answer);
        } else {
            if (b == c){
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
