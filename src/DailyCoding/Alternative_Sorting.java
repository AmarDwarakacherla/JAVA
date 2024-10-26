package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class Alternative_Sorting {
    public static void main(String[] args) {
        System.out.println(alternateSort(new int[]{1, 6, 9, 4, 3, 7, 8, 2}));
    }
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        int i = 0,j = arr.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<j){
            res.add(arr[j--]);
            res.add(arr[i++]);
        }
        if(i==j){
            res.add(arr[i]);
        }
        return res;
    }
}
