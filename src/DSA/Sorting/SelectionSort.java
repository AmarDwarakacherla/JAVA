package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1,5,4,3,2,1})));
    }
    public static int[] sort(int[] arr){
        int minIndex = 0, temp = 0;
        for(int i=0;i<arr.length-1; i++){
            minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
