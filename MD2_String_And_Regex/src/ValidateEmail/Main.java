package ValidateEmail;

public class Main {
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        Email email = new Email();
        for (String email1 : validEmail){
            boolean isValidate = email.validateEmail(email1);
            System.out.println("Email is " + email1 + "is validate" + isValidate);
        }
        for (String email1 : invalidEmail){
            boolean isValidate = email.validateEmail(email1);
            System.out.println("Email is " + email1 + "is invalidate" + isValidate);
        }
    }
}
