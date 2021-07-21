package b3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + " of Array 1 (3 elements): ");
            array1[i] = scanner.nextInt();
            i++;
        }
        int[] array2 = new int[5];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element " + (j + 1) + " of Array 2 (5 elements): ");
            array2[j] = scanner.nextInt();
            j++;
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        int size = array1.length + array2.length;
        int[] array3 = new int[size];
        for (int k = 0; k < array1.length; k++) {
            array3[k] = array1[k];
        }
        for (int k = 0; k < array2.length; k++) {
            array3[k + array1.length] = array2[k];
        }
        System.out.println("Merged array: " + Arrays.toString(array3));
    }
}

