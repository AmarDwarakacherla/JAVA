package DailyCoding;

import java.util.HashMap;

public class Pairs_with_difference_k {
    public static void main(String[] args) {
        System.out.println(countPairsWithDiffK(new int[]{1, 4, 1, 4, 5},3));
    }
    static int countPairsWithDiffK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]+k)) count += map.get(arr[i]+k);
            if(map.containsKey(arr[i]-k)) count += map.get(arr[i]-k);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;

    }
}
