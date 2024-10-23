package DailyCoding;

public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    static int maxProfit(int[] prices) {
        int buying = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i : prices){
            if(i < buying) buying = i;
            if(profit < i-buying) profit = i- buying;
        }
        return profit;
    }
}
