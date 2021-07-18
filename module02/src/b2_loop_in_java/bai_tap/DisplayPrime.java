package b2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Primes to display: ");
        int num= scanner.nextInt();

        int count =0;
        int n=2;
        while(count<num) {
            boolean check = true;
           for (int i=2;i<=n/2;i++) {
               if (n % i == 0) {
                   check=false;
                   break;
               }
           }
            if (check) {
                count++;
                System.out.println("Prime number "+count+" is "+n);
            }
            n++;
           }

        }
    }
