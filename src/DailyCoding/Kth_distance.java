package DailyCoding;
import java.util.*;
public class Kth_distance {
    public static void main(String[] args) {
        System.out.println(checkDuplicatesWithinK(new int[]{1, 2, 3, 1, 4, 5},3));
    }
    static public boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])) return true;
            set.add(arr[i]);
            if(i>=k) set.remove(arr[i-k]);
        }
        return false;
    }
}
