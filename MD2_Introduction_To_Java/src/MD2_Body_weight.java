import java.util.Scanner;

public class MD2_Body_weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter body weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter body height: meter");
        double height = scanner.nextDouble();
        double BMI = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "BMI", "Interpretation\n");
        if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        else if (BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        else if (BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", BMI, "Obese");
    }
}
