package b1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyTransfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exchangeRate = 23000;
        System.out.println("Input number of USD: ");
        int num=scanner.nextInt();
        System.out.println("The money in VND is: "+(num*exchangeRate));
    }
}
