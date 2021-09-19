package b15_xu_ly_ngoai_le_va_debug.thuc_hanh.NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    Integer x, y;

    public static void calc(int x, int y) {
        try {
            System.out.println("Kết quả cộng hai số: " + (x + y));
            System.out.println("Kết quả trừ hai số: " + (x - y));
            System.out.println("kết quả nhân hai số: " + (x * y));
            System.out.println("Kết quả chia hai số: " + (x / y));
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập x: ");
        int x = scaner.nextInt();
        System.out.println("\nVui lòng nhập y: ");
        int y = scaner.nextInt();
        calc(x, y);
    }
}
