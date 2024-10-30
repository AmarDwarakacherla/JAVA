package TCS_PRACTICE;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
