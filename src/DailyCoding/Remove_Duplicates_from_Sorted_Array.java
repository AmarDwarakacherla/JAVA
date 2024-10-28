package DailyCoding;

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 3, 7, 5};
        int[] arr2 = {2, 2, 5, 5, 7, 7};
        int[] arr3 = {8, 7};

        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
        System.out.println(removeDuplicates(arr3));
    }
    public static ArrayList<Integer> removeDuplicates(int[] nums) {
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       for(int i : nums) set.add(i);

       return new ArrayList<>(set);
    }
}
