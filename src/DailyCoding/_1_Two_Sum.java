package DailyCoding;

import java.util.Arrays;
import java.util.HashMap;

public class _1_Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0, 0};
    }
    static int[] Approach2(int[] nums, int target) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
