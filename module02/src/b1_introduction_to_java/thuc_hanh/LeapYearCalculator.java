import java.util.Scanner;

public class LeapYearCalculator {


    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Input a year");
        int year = scanner.nextInt();
        if(year%100 !=0) {
            if(year%4 ==0) {
                System.out.println("Year "+year+" is a leap year");
            } else {
                System.out.println("Year "+year+ " is not a leap year");
            }
        } else
            if(year%400 ==0) {
                System.out.println("Year "+year+" is a leap year");
            } else {
                System.out.println("Year "+year+ " is not a leap year");
            }

    }
}
