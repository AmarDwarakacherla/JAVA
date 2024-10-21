package Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr, 34, 0, arr.length));
    }
    static int  search(int[] arr, int target,int start, int end){
        if(start>=end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid]>target)  return search(arr, target, start, mid-1);
        return search(arr, target, mid+1, end);
    }
}
