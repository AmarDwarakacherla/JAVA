package DailyCoding.LeetCode;

public class _70_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairsApproach1(6));
    }
    public static int climbStairsApproach1(int n) {
        if(n == 0 || n == 1 ) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public int climbStairsApproach2(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairsApproach2(n - 1) + climbStairsApproach2(n - 2);
    }

    public int climbStairsApproach3(int n) {
        int a = 0, b = 1, temp;
        while (n-- > 0) {
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
