package DailyCoding.LeetCode;

public class _746_Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
    static public int minCostClimbingStairs(int[] cost) {
        int prev2 = cost[0], prev1 = cost[1], curr = 0;
        for(int i=2;i<cost.length;i++){
            curr = cost[i] +  Math.min(prev1,prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;

    }
}
