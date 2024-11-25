package DailyCoding;
import java.util.*;
public class Union_of_Two_Sorted_Arrays_with_Distinct_Elements {
    public static void main(String[] args) {
        System.out.println(findUnion(new int[]{1,2,3,4,7,8},new int[]{1,2,3,6,7,10,13}));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res.add(a[i]);
                i++;
            }else if(a[i]>b[j]){
                res.add(b[j]);
                j++;
            }else{
                res.add(a[i]);
                i++;j++;
            }
        }
        while(i<a.length){
            res.add(a[i++]);
        }
        while(j<b.length){
            res.add(b[j++]);
        }
        return res;
    }
}
