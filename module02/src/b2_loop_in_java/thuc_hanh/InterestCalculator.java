import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount: ");
        int amount=scanner.nextInt();
        System.out.println("Input interest rate (%/year): ");
        double rate=scanner.nextDouble();
        System.out.println("Input number of month");
        int month=scanner.nextInt();
        double interestAmount=0;
        for(int i = 0; i < month; i++){
            interestAmount += amount * (rate/100)/12 * month;
        }
        System.out.println("Interest is: "+interestAmount);
    }
}
