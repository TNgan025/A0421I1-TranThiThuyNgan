package b19_String_Regex.bai_tap.Validate_PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    //(xx)-(0xxxxxxxxx)
    private static final String REGEX ="[(]\\d{2}[)][-(0]\\d{9}[)]";

    public PhoneNumber() {
    }


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
