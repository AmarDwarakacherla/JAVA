package DailyCoding;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{2,0,2,1,1,0})));
        System.out.println(Arrays.toString(Apprach2(new int[]{2,0,2,1,1,0})));
    }
    public static int[] sortColors(int[] nums) {
       int left = 0, mid = 0, right = nums.length-1;
       while(mid<=right){
           if(nums[mid]==0){
               swap(nums,left,mid);
               mid++;
               left++;
           }
           else if(nums[mid]==1){
               mid++;
           }
           else{
               swap(nums,mid,right);
               right--;
           }
       }
        return nums;
    }
    public static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;

    }
    public static int[] Apprach2(int[] nums){
        int zero = 0, one = 0, two = 0;
        for(int i : nums){
            if(i == 0) zero++;
            else if(i == 1) one++;
            else two++;
        }
        int idx = 0;
        for(int i=0;i<zero;i++){
            nums[idx++] = 0;
        }
        for(int i=0;i<one;i++){
            nums[idx++] = 1;
        }
        for(int i=0;i<two;i++){
            nums[idx++] = 2;
        }
        return nums;
    }
}
