package Bot;

import java.util.*;

public class Find_duplicate_elements_in_an_array {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,1,5,4,4,7,8,8,8}));
    }
    static ArrayList<Integer> findDuplicate(int[] arr){
        Map<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
//        }
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>1){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
