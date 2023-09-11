package ValidatePhoneNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneNumber phoneNumber = new PhoneNumber();
        boolean isvalidate;
        do {
            System.out.println("Enter phone number:");
            String input = scanner.nextLine();
            isvalidate =  phoneNumber.validatePhoneNumber(input);
            System.out.println(input + " " + isvalidate);
        }while (!isvalidate);
    }
}
