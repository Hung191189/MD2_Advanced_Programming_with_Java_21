package DemoRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static String regexDemo = "[f]+[a-c]+[0-9]+$";
    public Regex(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(regexDemo);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
