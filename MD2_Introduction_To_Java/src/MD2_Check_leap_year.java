import java.util.Scanner;

public class MD2_Check_leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " is not leap year");
        } else if (year % 100 == 0 && year % 400 == 0 ) {
            System.out.println(year + " is leap year");
        }
    }
}
