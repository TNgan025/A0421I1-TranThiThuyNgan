package b3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Input the element need to add: ");
        int number = scanner.nextInt();
        System.out.println("Input the index need to add: ");
        int index = scanner.nextInt();
        if (index <= 0 || index >= array.length - 1) {
            System.out.println(" Can not add any element to array");
            System.out.println(Arrays.toString(array));
        } else {
            for (int j = index; j < array.length - 1; j++) {

                array[j + 1] = array[j];
            }
            array[index] = number;

            System.out.println("New array:" + Arrays.toString(array));
        }
    }
}
