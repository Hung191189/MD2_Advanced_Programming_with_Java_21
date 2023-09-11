package ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static String validatePhoneNumber = "\\d{2}+-+[0]+\\d{9}";

    public PhoneNumber(){

    }
    public boolean validatePhoneNumber(String string){
        Pattern pattern = Pattern.compile(validatePhoneNumber);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
