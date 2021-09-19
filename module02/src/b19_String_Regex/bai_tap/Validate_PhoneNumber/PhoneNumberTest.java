package b19_String_Regex.bai_tap.Validate_PhoneNumber;

import b19_String_Regex.bai_tap.Validate_class_name.ClassName;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;

    public static final String[] validPhoneNumber = new String[] { "(84)-(0978489648)", "(84)-(0123456789)"};
    public static final String[] invalidPhoneNumber = new String[] { "(a8)-(22222222)", "(84)-(01234b6789)" };

    public static void main(String args[]) {
        phoneNumber = new PhoneNumber();
        for (String account : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Phone number is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Phone number is " + account +" is invalid: "+ isvalid);
        }
    }
}
