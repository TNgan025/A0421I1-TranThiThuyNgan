package b1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToWord {
    final static String[] ones = {"", "one", "two", "three", "four", "fine", "six", "seven", "eight","nine","ten"+
            "eleven","twelve", "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    final static String[] tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number=scanner.nextInt();
        transferNumberToWord(number/100,number%100==0?" hundred ":" hundred and ");
        transferNumberToWord(number%100,"");
    }

    public static void transferNumberToWord(int num,String value) {
        System.out.print(num>19?tens[num/10]+" "+ones[num%10]: ones[num]);
        System.out.print(num>0? value: "");
    }

}
