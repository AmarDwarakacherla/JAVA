package DailyCoding;

import java.util.Arrays;

public class Move_Zeros_to_End {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,0,2,4};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        while(index< nums.length){
            nums[index++] = 0;
        }
    }
}
