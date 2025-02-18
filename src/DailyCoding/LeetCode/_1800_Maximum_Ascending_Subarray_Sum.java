package DailyCoding.LeetCode;
import java.util.*;
import java.util.stream.Collectors;

public class _1800_Maximum_Ascending_Subarray_Sum {
    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{10,20,30,5,10,50}));
        int arr[] = new int[]{1,2,3,4};
        List<Integer>  res = Arrays.stream(arr).map(x-> x*2).boxed().collect(Collectors.toList());
        System.out.println(res);
    }

    static public int maxAscendingSum(int[] nums) {
        if(nums.length == 0) return 0;
        int maxSum = nums[0], sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
