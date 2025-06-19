package DailyCoding;

import java.util.HashMap;
import java.util.Map;

public class Find_first_non_repeating_element_in_a_given_Array_of_integers {
    public static void main(String[] args) {
        System.out.println(Approach2(new int[]{1,5,1,7,5,7,8,9}));
    }
    public static int Approach2(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
//        for(int i : arr){
//            if(map.containsKey(i)){
//                map.put(i,map.get(i)+1);
//            }else{
//                map.put(i,1);
//            }
//        }
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i: arr) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static int Approach1(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    break;
                }
            }
            if(j==arr.length){
                return arr[i];
            }
        }
        return -1;
    }
}
