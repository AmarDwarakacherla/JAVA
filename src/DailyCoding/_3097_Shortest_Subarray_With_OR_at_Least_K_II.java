package DailyCoding;

public class _3097_Shortest_Subarray_With_OR_at_Least_K_II {
    public static void main(String[] args) {
        System.out.println(minimumSubarrayLength(new int[]{1,2,3},2));

    }
    static public int minimumSubarrayLength(int[] nums, int k) {
        int minlen = Integer.MAX_VALUE;
        int len = 0;
        int or = 0;
        for(int i=0;i<nums.length;i++){
            len = 0;
            or = nums[i];
            for(int j=i;j<nums.length;j++){
                if((nums[i] | or) == k){
                    len++;
                }
                minlen = Math.min(minlen,len);
                or = or | nums[i];
            }
        }
        return minlen;
    }
}
