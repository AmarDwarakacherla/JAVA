package DailyCoding;

import java.util.Arrays;

public class Missing_and_Repeating_in_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,4,4,5};
        System.out.println(Arrays.toString(findTwoElement(arr)));
    }
    public static int[] findTwoElement(int arr[]){
        int n = arr.length;
        boolean[] found = new boolean[n+1];
//        Arrays.fill(found,false);
        int duplicate = 0;
        for(int num : arr){
            if(found[num]){
               duplicate = num;
            }
            else{
                found[num] = true;
            }
        }
        int missing = 0;
        for(int i=1;i<=n;i++){
            if(!found[i]){
                missing = i;
            }
        }
        return new int[] {duplicate,missing};
    }
}
