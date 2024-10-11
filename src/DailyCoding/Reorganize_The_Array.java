package DailyCoding;
import java.util.*;
public class Reorganize_The_Array {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(-1, -1, 6, 1, 9, 3, 2, -1, 4, -1));
        List<Integer> res = rearrange(arr);
        System.out.println(res);
    }
    public static List<Integer> rearrange(List<Integer> arr) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(arr.size(),-1));
        for(int i : arr){
            if(i>=0 && i<arr.size()){
                result.set(i,i);
            }
        }
        return result;
    }
}
