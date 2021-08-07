package b4_oop_in_java.thuc_hanh;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width: ");
        double width = scanner.nextDouble();
        System.out.println("Input height");
        double height = scanner.nextDouble();
        Rectangle rec1 = new Rectangle(width, height);
        System.out.println("Your Rectangle:" + rec1.display());
        System.out.println("Area:" + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
    }
}
