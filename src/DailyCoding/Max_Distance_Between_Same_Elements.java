package DailyCoding;

import java.util.HashMap;

public class Max_Distance_Between_Same_Elements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,2,1};
        System.out.println(maxDistance(arr));
        int[] arr2 = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDistance(arr2));
    }
    public static int maxDistance(int[] arr) {
        HashMap<Integer,Integer> firstIndex = new HashMap<>();
        HashMap<Integer,Integer> lastIndex = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!firstIndex.containsKey(arr[i])){
                firstIndex.put(arr[i],i);
            }
            lastIndex.put(arr[i],i);
        }
        int maxDistance = 0;
        for(int i : firstIndex.keySet()){
            int dis = lastIndex.get(i) - firstIndex.get(i);
            maxDistance = Math.max(dis, maxDistance);
        }
        return maxDistance;
    }
}
