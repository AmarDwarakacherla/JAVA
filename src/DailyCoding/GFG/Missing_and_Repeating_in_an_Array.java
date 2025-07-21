package DailyCoding.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Missing_and_Repeating_in_an_Array {
    public static void main(String[] args) {
        System.out.println(findApproach1(new int[]{1,2,3,3,7,5,6}));
        System.out.println(findApprach2(new int[]{1,2,3,3,7,5,6}));
    }
    public static ArrayList<Integer>  findApproach1(int[] arr){
        int[] t = new int[arr.length+1];
        Arrays.fill(t,0);
        for(int i : arr){
            t[i]++;
        }
        int missing = 0, duplicate = 0;
        for(int i=1;i<arr.length+1;i++){
            if(t[i]==0) missing = i;
            else if(t[i]==2) duplicate = i;
        }
        return new ArrayList<>(Arrays.asList(missing, duplicate));
    }

    public static ArrayList<Integer> findApprach2(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int missing = 0, duplicate = 0;
        for(int i=1;i<arr.length+1;i++){
            if(!freq.containsKey(i)) missing = i;
            else if(freq.get(i)==2) duplicate = i;
        }
        return new ArrayList<>(Arrays.asList(missing, duplicate));
    }
}
