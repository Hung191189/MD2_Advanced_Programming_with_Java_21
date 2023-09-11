package Ten_Cua_Lop_Hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static String regexClass = "^[C|A|P]+\\d{4}+[G|H|I|K]";
    public ValidateClassName (){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(regexClass);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
