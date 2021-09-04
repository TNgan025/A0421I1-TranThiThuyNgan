package b14_Thuat_toan_sap_xep.bai_tap.Insertion_Sort;

public class InsertionSort {
    static int[] list = {2, 1, 4, 3, 0, 10, 52, 9, 7};
    public static void insertionSort(int[] list) {

        int size = list.length;
        for (int i = 1; i < size; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && key < list[j]) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
            }
        for (int k = 0; k < size; k++) {
            System.out.print(list[k] + "\t");
        }
        }
    public static void main(String[] args) {
        insertionSort(list);
    }

}
