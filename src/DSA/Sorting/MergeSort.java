package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1, n2 = right-mid;
        int[] l = new int[n1], r = new int[n2];

        for(int i=0;i<n1;i++) l[i] = arr[left+i];
        for(int j=0;j<n2;j++) r[j] = arr[mid+1+j];

        int i=0, j= 0, t = left;
        while(i < n1 && j < n2){
            arr[t++] = (l[i] <= r[j]) ? l[i++] : r[j++];
        }
        while(i < n1) arr[t++] = l[i++];
        while(j < n2) arr[t++] = r[j++];
    }
}
