package DailyCoding.LeetCode;

public class _2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
        long end =System.nanoTime();
        System.out.println((end-start)/1_000_000.00);


        long start1 = System.nanoTime();
        System.out.println(Approach2(new int[]{-3,-2,-1,0,0,1,2}));
        long end1 =System.nanoTime();
        System.out.println((end1-start1)/1_000_000.00);


    }
    static public int maximumCount(int[] nums) {
        int pos = 0, neg = 0;
        for(int i: nums){
            if(i>0) pos++;
            else if(i<0) neg++;
        }
        return Math.max(pos, neg);
    }

    static int Approach2(int[] nums){
        int neg = findFirstNegative(nums);
        int pos = nums.length - fintFirstPositive(nums);
        return Math.max(neg,pos);
    }

    static int findFirstNegative(int[] nums){
        int left = 0, right = nums.length-1, mid = 0;
        while(left<=right){
            mid = left + (right - left)/2;
            if(nums[mid]<0){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    static int fintFirstPositive(int[] nums){
        int left = 0, right = nums.length-1, mid = 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(nums[mid]>0){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

}
