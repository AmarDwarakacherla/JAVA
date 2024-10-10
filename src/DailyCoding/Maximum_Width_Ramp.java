package DailyCoding;

import java.util.Stack;

public class Maximum_Width_Ramp {
    public static void main(String[] args) {
        System.out.println(maxWidthRamp(new int[]{9,8,1,0,1,9,4,0,4,1}));
    }
    public static int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int maxWidth = 0;
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }
        return maxWidth;



//        Brute Force Method
//        int maxWidth = 0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                if(nums[i]<=nums[j]){
//                    maxWidth = Math.max(maxWidth, j-i);
//                }
//            }
//        }
//        return maxWidth;
    }
}
