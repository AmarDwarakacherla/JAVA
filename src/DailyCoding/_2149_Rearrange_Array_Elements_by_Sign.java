package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class _2149_Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{3,1,-2,-5,2,-4})));

    }

    static int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];
        int pos = 0, neg = 1;
        for(int num : nums){
            if(num>0){
                res[pos] = num;
                pos += 2;
            }
            else{
                res[neg] = num;
                neg += 2;
            }
        }
        return res;

    }
    static int[] Approach2(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i : nums){
            if(i > 0){
                pos.add(i);
            }else{
                neg.add(i);
            }
        }
        int o = 0, e = 0, idx = 0;
        while(o < nums.length/2){
            arr[idx++] = pos.get(e);
            arr[idx++] = neg.get(o);
            e++;
            o++;
        }
        return arr;
    }
}
