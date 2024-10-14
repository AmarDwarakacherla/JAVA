//Maximal Score After Applying K Operations
//You are given a 0-indexed integer array nums and an integer k. You have a starting score of 0.
//In one operation:
//choose an index i such that 0 <= i < nums.length,
//increase your score by nums[i], and
//replace nums[i] with ceil(nums[i] / 3).
//Return the maximum possible score you can attain after applying exactly k operations.
//The ceiling function ceil(val) is the least integer greater than or equal to val.
//Example 1:
//Input: nums = [10,10,10,10,10], k = 5
//Output: 50
//Explanation: Apply the operation to each array element exactly once. The final score is 10 + 10 + 10 + 10 + 10 = 50.
//Example 2:
//Input: nums = [1,10,3,3,3], k = 3
//Output: 17
//Explanation: You can do the following operations:
//Operation 1: Select i = 1, so nums becomes [1,4,3,3,3]. Your score increases by 10.
//Operation 2: Select i = 1, so nums becomes [1,2,3,3,3]. Your score increases by 4.
//Operation 3: Select i = 2, so nums becomes [1,1,1,3,3]. Your score increases by 3.
//The final score is 10 + 4 + 3 = 17.
//





        package DailyCoding;
import java.util.*;
public class Maximal_Score_After_Applying_K_Operations {
    public static void main(String[] args) {
        System.out.println(maxKelements(new int[]{1,10,3,3,3},3));

    }
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.add(num);
        }
        long score = 0;
        for (int i = 0; i < k; i++) {
            int maxVal = maxHeap.poll();
            score += maxVal;
            int newVal = (int) Math.ceil(maxVal / 3.0);
            maxHeap.add(newVal);
        }
        return score;
    }
}
