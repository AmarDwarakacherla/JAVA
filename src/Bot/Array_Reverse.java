package Bot;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        Approach1(arr);
        System.out.println("By using Approach1: "+Arrays.toString(arr));
        arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        Approach2(arr);
        System.out.println("By using Approach2: "+Arrays.toString(arr));
        arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        Approach3(arr);
        System.out.println("By using Approach3: "+Arrays.toString(arr));
    }
    static void Approach1(int[] arr){
        int start = 0, end = arr.length-1, t = 0;
        while(start < end){
            t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;end--;
        }
    }
    static void Approach2(int[] arr){
        int t = 0,n = arr.length;
        for(int i=0;i<n/2;i++){
            t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
    }
    static void Approach3(int[] arr){
        int t[] = new int[arr.length];
        int n = arr.length;
        for(int i=0;i<n;i++){
            t[i] = arr[n-i-1];
        }
        for(int i=0;i<n;i++){
            arr[i] = t[i];
        }
    }
}
