package DailyCoding.GFG;

import java.util.Arrays;

public class Rearrange_Array_Alternately {
    public static int[] rearrangeApproach2(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i+=2){
            int j = n-1;
            while(j > i){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeApproach2(new int[]{1,2,3,4,5,6,7})));

    }
}
