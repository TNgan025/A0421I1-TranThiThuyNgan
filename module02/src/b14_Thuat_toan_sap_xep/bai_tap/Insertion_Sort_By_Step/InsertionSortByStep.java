package b14_Thuat_toan_sap_xep.bai_tap.Insertion_Sort_By_Step;

import java.util.Scanner;

public class InsertionSortByStep {
    static int[] list = {2, 1, 4, 3};

    public static void insertionSortByStep(int[] list) {

        System.out.println("The list before sorting ");
        for (int k = 0; k < list.length; k++) {
            System.out.print(+list[k]+"\t");}
        System.out.println();
        int size = list.length;
        for (int i = 1; i < size; i++) {
            int key = list[i];
            System.out.println("Choose the element with value "+key +" at index "+i);
            int j = i - 1;
            while (j >= 0 && key < list[j]) {
                System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                list[j + 1] = list[j];
                j--;
            }

                System.out.println("Insert the element with value "+key + " to index "+(j+1));
            list[j + 1] = key;
            System.out.println("The list after step "+i);
            for (int k = 0; k < size; k++) {
                System.out.print(list[k] + "\t");
        }
            System.out.println();
    }
}
    public static void main(String[] args) {
        insertionSortByStep(list);
    }

}
