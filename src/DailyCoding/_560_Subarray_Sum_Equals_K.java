package DailyCoding;

import java.util.HashMap;

public class _560_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1};
        int target = 2;
        System.out.println(subarraySum(arr,target));
        System.out.println(Apprach2(arr,target));
    }
    static int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int prefixsum = 0;
        for(int i : nums){
            prefixsum += i;
            if(freq.containsKey(prefixsum-k)){
                count += freq.get(prefixsum-k);
            }
            freq.put(prefixsum,freq.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
    static int Apprach2(int[] nums, int k){
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j = i;j<nums.length;j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }return count;
    }
}
