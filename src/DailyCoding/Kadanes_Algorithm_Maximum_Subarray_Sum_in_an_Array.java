package DailyCoding;

public class Kadanes_Algorithm_Maximum_Subarray_Sum_in_an_Array {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(Approach2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int maxsum = 0, sum = 0;
        for(int i : nums){
            sum += i;
            maxsum = Math.max(sum,maxsum);
            if(sum<=0) sum = 0;
        }
        return maxsum;
    }
    public static int Approach2(int[] nums){
        int maxsum = 0, sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                maxsum = Math.max(sum,maxsum);
            }
        }
        return maxsum;
    }
}
