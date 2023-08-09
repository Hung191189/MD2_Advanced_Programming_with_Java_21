import java.util.Scanner;

public class MD2_Chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Enter F:");
                    F = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + FtoC(F));
                }
                case 2: {
                    System.out.println("Enter C:");
                    C = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + CtoF(C));
                }
            }
        }while (choice != 0);
    }
    public static double CtoF(double C){
        double F = (9.0/5)*C +32;
        return F;
    }
    public static double FtoC(double F){
        double C = (5.0/9)*(F -32);
        return C;
    }
}
