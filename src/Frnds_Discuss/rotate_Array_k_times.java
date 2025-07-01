package Frnds_Discuss;

import java.util.Arrays;

public class rotate_Array_k_times {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray2(new int[]{1,2,3,4,5},2)));
    }
    // left rotation
    public static int[] rotateArray1(int[] arr,int k){
        for(int i=0;i<k;i++){
            int t = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = t;
        }
        return arr;
    }

    public static int[] rotateArray2(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr,0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return arr;
    }
    public  static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
