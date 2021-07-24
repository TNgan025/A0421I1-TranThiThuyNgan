package b3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of Matrix");
        int size = scanner.nextInt();
        int[][] arr1= new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Input element [" + i + ", " + j + "]: ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        int max = arr1[0][0];
        int index1 = 1;
        int index2 = 1;
        for (int m = 0; m < size; m++) {
            for (int n = 0; n < arr1.length; n++) {
                if (arr1[m][n] > max) {
                    max = arr1[m][n];
                    index1 = m + 1;
                    index2 = n + 1;
                }
            }
        }
        System.out.println("Max of matrix is "+max);
    }
}
