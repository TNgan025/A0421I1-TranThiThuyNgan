package b1_introduction_to_java.thuc_hanh;
import java.util.Scanner;
public class MainArea {
    public static void main(String[] args) {
        float width;
        float height;
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float Area = width*height;
        System.out.println("Area is "+Area);
    }
}
