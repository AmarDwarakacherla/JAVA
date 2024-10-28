package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_duplicates_in_array {
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1,2,2,3,3,5,7,7}));

    }
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
}
