package b3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
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
        System.out.println("Input element need to delete: ");
        int number=scanner.nextInt();
        int index=-1;
        for(int k=0; k<array.length; k++) {
            if(array[k]==number){
                index=k;
            }
        }
        if(index==-1) {
            System.out.println("Element "+number+ " is not in array");
        } else {
            for(int j=index; j<array.length; j++) {
                array[index]=array[index+1];
            }
            System.out.println("New array:" +Arrays.toString(array));
        }

    }
}

