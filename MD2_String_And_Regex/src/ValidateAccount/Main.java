package ValidateAccount;

public class Main {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
    public static void main(String[] args) {
        Account account = new Account();
        for(String account1 : validAccount){
            boolean isValidate = account.validate(account1);
            System.out.println(account1 + isValidate);
        }
        for(String account1 : invalidAccount){
            boolean isValidate = account.validate(account1);
            System.out.println(account1 + isValidate);
        }
    }
}
