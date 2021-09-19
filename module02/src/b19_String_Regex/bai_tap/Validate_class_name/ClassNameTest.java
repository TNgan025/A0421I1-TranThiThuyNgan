package b19_String_Regex.bai_tap.Validate_class_name;

import b19_String_Regex.thuc_hanh.Validate_account.AccountExample;

public class ClassNameTest {
    private static ClassName className;

    public static final String[] validClassName = new String[] { "C0318G", "A5318H", "P4981I", "A5679L"};
    public static final String[] invalidClassName = new String[] { "C@328G", "M0318G", "P0323A", "M0323A" };

    public static void main(String args[]) {
        className = new ClassName();
        for (String account : validClassName) {
            boolean isvalid = className.validate(account);
            System.out.println("Class name is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidClassName) {
            boolean isvalid = className.validate(account);
            System.out.println("Class name is " + account +" is invalid: "+ isvalid);
        }
    }
}
