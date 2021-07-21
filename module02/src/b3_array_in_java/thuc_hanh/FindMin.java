package b3_array_in_java.thuc_hanh;

public class FindMin {
    public static void main(String[] args) {
        int[] arr ={1,8,5,20,7,9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " +arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 1;i<arr.length;i++){
                if(arr[i]<arr[0]){
                    index = i;
                }
        }
        return index;
    }
}
