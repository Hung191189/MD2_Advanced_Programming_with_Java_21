import java.util.Scanner;

public class MD2_Show_hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
