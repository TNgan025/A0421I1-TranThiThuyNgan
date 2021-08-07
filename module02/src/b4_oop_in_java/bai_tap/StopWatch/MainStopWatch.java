package b4_oop_in_java.bai_tap;

import java.util.Arrays;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(arr);
        stopWatch.stop();
        System.out.println("Times: " + stopWatch.getElapsedTime());
    }
}
