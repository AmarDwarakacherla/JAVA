package DailyCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Union_of_Two_Sorted_Arrays_with_Duplicate_Elements {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{1, 2, 3, 6, 7};
        ArrayList<Integer> res = findUnion(a,b);
        System.out.println(res);

    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> dist = new HashSet<>();
        for(int i : a){
            dist.add(i);
        }
        for(int i : b){
            dist.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : dist){
            res.add(i);
        }
        Collections.sort(res);
        return res;

    }
}
