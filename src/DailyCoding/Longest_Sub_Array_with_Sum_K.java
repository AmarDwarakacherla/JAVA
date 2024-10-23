package DailyCoding;

import java.util.HashMap;

public class Longest_Sub_Array_with_Sum_K {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 7, 1, 9};
        int sum = 15;
        System.out.println(lenOfLongSubarr(arr,arr.length,sum));
        int[] arr1 = new int[]{-1, 2, 3};
        int sum1= 6;
        System.out.println(lenOfLongSubarr(arr1,arr1.length,sum1));

    }

    public static int lenOfLongSubarr(int A[], int N, int K) {
        int prefixSum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            prefixSum += A[i];
            if(prefixSum == K) maxLen = i+1;
            if(map.containsKey(prefixSum-K)){
                maxLen = Math.max(maxLen,i-map.get(prefixSum-K));
            }
            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLen;

    }
    public static int Approach2(int arr[], int N, int K) {
        int maxLen = 0;
        int sum = 0;
        int currLen = 0;
        for(int i=0;i<N;i++){
            sum = 0;
            currLen = 0;
            for(int j=i;j<N;j++){
                sum+=arr[j];
                currLen++;
                if(sum==K){
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }
        return maxLen;

    }
}
