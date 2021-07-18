package b2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayDrawing {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the triangle");
        System.out.println("2. Print the  square triangle:top-left");
        System.out.println("3. Print the  square triangle:top-right");
        System.out.println("4. Print the  square triangle:botton-left");
        System.out.println("5. Print the  square triangle:botton-right");
        System.out.println("6. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1. Print the triangle");
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                        }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                    for(int j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                for(int i=7;i>=1;i--) {
                    for(int j=1;j<=i;j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("No choice!");
                break;
        }
    }
}
