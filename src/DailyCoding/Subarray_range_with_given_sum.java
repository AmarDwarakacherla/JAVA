
//
//Given an unsorted array of integers arr[], and a target tar, determine the number of subarrays whose elements sum up to the target value.
//Examples:
//Input: arr[] = [10, 2, -2, -20, 10] , tar = -10
//Output: 3
//Explanation: Subarrays with sum -10 are: [10, 2, -2, -20], [2, -2, -20, 10] and [-20, 10].
//Input: arr[] = [1, 4, 20, 3, 10, 5] , tar = 33
//Output: 1
//Explanation: Subarray with sum 33 is: [20,3,10].
//Expected Time Complexity: O(n)
//Expected Auxilary Space: O(n)

package DailyCoding;
import java.util.*;
public class Subarray_range_with_given_sum {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, -2, -20, 10};
        int tar = -10;
        System.out.println(subArraySum(arr, tar));

    }
    public static int subArraySum(int arr[], int tar) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        int currentSum = 0, count = 0;
        for(int num : arr){
            currentSum += num;
            if(prefixSum.containsKey(currentSum - tar)){
                count += prefixSum.get(currentSum - tar);
            }
            prefixSum.put(currentSum,prefixSum.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}
