package DailyCoding;

import java.util.HashSet;

public class Triplet_Family {
    public static void main(String[] args) {
        System.out.println(new Triplet_Family().findTriplet(new int[]{1,2,3,4,5}));

    }
    public boolean findTriplet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(set.contains(sum)){
                    return true;
                }
            }
        }
        return false;
    }
}
