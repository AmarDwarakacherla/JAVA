package DailyCoding;

public class Two_Smallests_in_Every_Subarray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 1, 5, 6};
        System.out.println(pairWithMaxSum(arr));
        System.out.println(pairWithMaxSumOptimalApproach(arr));


    }
    public static int pairWithMaxSumOptimalApproach(int[] arr){
        int n = arr.length;
        if (n < 2) {
            return -1;
        }
        int maxSum = -1;
        for (int i = 0; i < n - 1; i++) {
            int first = Math.min(arr[i], arr[i + 1]);
            int second = Math.max(arr[i], arr[i + 1]);
            int sum = first + second;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static int pairWithMaxSum(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            int[] t = findFirstSecondMin(new int[]{arr[i],arr[i+1]});
            max = Math.max(max,(t[0]+t[1]));
        }
        return max;
    }
    public static int[] findFirstSecondMin(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second && first!=arr[i]){
                second = arr[i];
            }
        }
        return new int[]{first,second};
    }
}
