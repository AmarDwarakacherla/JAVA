package DailyCoding.Bot;

import java.util.ArrayList;
import java.util.Arrays;

public class Day_2_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : arr){
            if(i%2!=0){
                res.add(i);
            }
        }
        System.out.println(res);

    }
}
