package DailyCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Intersection_Array {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,2,3,4,5,5};
        int arr2[] = new int[]{2,2,5};
        int res[] = intersection(arr1,arr2);
        Arrays.stream(res).forEach(System.out::println);
        Arrays.stream(res).forEach(result -> System.out.print(result+" "));
    }
    public static int[] intersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1) set.add(i);
        Set<Integer> res = new HashSet<>();
        for(int i : arr2){
            if(set.contains(i)){
                res.add(i);
            }
        }
        int[] resArr = new int[res.size()];
        int index = 0;
        for(Integer i : res){
            resArr[index++] = i;
        }
        return resArr;
    }
}
