package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1,5,4,3,2,1})));
    }
    public static int[] sort(int[] arr){
        int val = 0, j = 0;
        for (int i=1;i<arr.length;i++) {
            val = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        return arr;
    }
}
