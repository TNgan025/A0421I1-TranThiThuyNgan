//package b15_xu_ly_ngoai_le_va_debug.bai_tap.IllegalTriangleException;
//
//import java.util.Scanner;
//
//public class Triangle {
//
//    Integer a, b, c;
//
//    public static void displayTriangle(int a, int b, int c) {
//        try {
//            System.out.println("Hình tam giác có các cạnh " + a + ", " + b + " và " + c);
//        } catch (Exception e) {
//            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào cạnh thứ 1 của hình tam giác: ");
//        int a = scanner.nextInt();
//        System.out.println("Nhập vào cạnh thứ 2 của hình tam giác: ");
//        int b = scanner.nextInt();
//        System.out.println("Nhập vào cạnh thứ 3 của hình tam giác: ");
//        int c = scanner.nextInt();
//
//        displayTriangle(a, b, c);
//    }
//}
import java.io.*;
class files
{
    public static void main(String args[])
    {
        File obj = new File("/java/system");
        System.out.print(obj.getAbsolutePath());
    }
}