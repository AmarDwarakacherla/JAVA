package DSA.Two_Pointer;

import java.util.*;

public class _15_3Sum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int left = 0, right = nums.length-1, sum = 0;
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            left = i+1;
            right = nums.length-1;
            while(left < right){
                sum = nums[i] + nums[left]+nums[right];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left]==nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;right--;
                }else if(sum<0) left++;
                else right --;
            }
        }
        return new ArrayList<>(set);
    }
}
